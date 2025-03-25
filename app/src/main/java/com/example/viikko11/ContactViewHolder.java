package com.example.viikko11;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    //public ImageView contactImage;
    public TextView contactNameText, contactNumberText, contactGroupText;
    public Button contactDetailsButton, contactDeleteButton;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        //contactImage = itemView.findViewById(R.id.ContactImage);
        contactNameText = itemView.findViewById(R.id.ContactNameText);
        contactNumberText = itemView.findViewById(R.id.ContactNumberText);
        contactGroupText = itemView.findViewById(R.id.ContactGroupText);
        contactDetailsButton = itemView.findViewById(R.id.ContactDetailsButton);
        contactDeleteButton = itemView.findViewById(R.id.ContactDeleteButton);
    }
}
