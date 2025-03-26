package com.example.viikko11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddContactActivity extends AppCompatActivity {
    private EditText firstNameEdit, lastNameEdit, phoneNumberEdit;
    private RadioGroup contactTypeRadioGroup;
    private Button addContactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
    }

    public void addNote(View view) {
        firstNameEdit = findViewById(R.id.FirstNameEdit);
        lastNameEdit = findViewById(R.id.LastNameEdit);
        phoneNumberEdit = findViewById(R.id.PhoneNumberEdit);
        contactTypeRadioGroup = findViewById(R.id.ContactTypeRadioGroup);

        String firstName = firstNameEdit.getText().toString();
        String lastName = lastNameEdit.getText().toString();
        String phoneNumber = phoneNumberEdit.getText().toString();

        String contactGroup = (contactTypeRadioGroup.getCheckedRadioButtonId() == R.id.PersonalRadioButton) ? "Henkilökohtainen" : "Työ";

        ContactStorage.getInstance().addContact(new Contact(firstName, lastName, phoneNumber, contactGroup));
        //finish();
    }
}