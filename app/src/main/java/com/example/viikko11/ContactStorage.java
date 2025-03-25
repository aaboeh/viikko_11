package com.example.viikko11;

import java.util.ArrayList;

public class ContactStorage {
    private ArrayList<Contact> contacts;
    private static ContactStorage contactStorage = null;

    private ContactStorage() {
        contacts = new ArrayList<>();
    }

    public static ContactStorage getInstance() {
        if (contactStorage == null) {
            contactStorage = new ContactStorage();
        }
        return contactStorage;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(int index) {
        contacts.remove(index);
    }
}
