package com.example.viikko11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ContactListAdapter adapter;
    private ContactStorage contactStorage;
    private Button sortAlphabeticallyButton, sortByGroupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactStorage = ContactStorage.getInstance();
        adapter = new ContactListAdapter(getApplicationContext(), contactStorage.getContacts());

        recyclerView = findViewById(R.id.ListContactsRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        sortAlphabeticallyButton = findViewById(R.id.SortAlphabeticallyButton);
        sortAlphabeticallyButton.setOnClickListener(view -> sortAlphabetically());

        sortByGroupButton = findViewById(R.id.SortByGroupButton);
        sortByGroupButton.setOnClickListener(view -> {
            ContactStorage.getInstance().sortByGroup();
            adapter.notifyDataSetChanged();
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }

    //Täältä haettu apua: https://stackoverflow.com/questions/33088677/sort-list-of-objects-using-collection-sort-with-lambdas-only
    private void sortAlphabetically() {
        ArrayList<Contact> contacts = ContactStorage.getInstance().getContacts();
        Collections.sort(contacts, (c1, c2) -> c1.getFirstName().compareTo(c2.getFirstName()));
        adapter.notifyDataSetChanged();
    }

    public void switchToAddContact(View view) {
        Intent intent = new Intent(this, AddContactActivity.class);
        startActivity(intent);
    }
}
