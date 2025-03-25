package com.example.viikko11;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String contactGroup;

    public Contact(String firstName, String lastName, String phoneNumber, String contactGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.contactGroup = contactGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContactGroup() {
        return contactGroup;
    }
}
