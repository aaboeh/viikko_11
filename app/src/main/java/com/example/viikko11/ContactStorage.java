package com.example.viikko11;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void sortByGroup() {
        Iterator<Contact> iterator = contacts.iterator();
        ArrayList<Contact> workContacts = new ArrayList<>();
        ArrayList<Contact> personalContacts = new ArrayList<>();

        while(iterator.hasNext()) {
            Contact contact = iterator.next();
            if("Työasiat".equals(contact.getContactGroup())) {
                workContacts.add(contact);
            } else {
                personalContacts.add(contact);
            }
        }

        contacts.clear();
        contacts.addAll(workContacts);
        contacts.addAll(personalContacts);
    }
}

