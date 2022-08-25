package com.bridgelabz.addressbookmanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AddressBook professionalAddressBook = new AddressBook();
        professionalAddressBook.addContacts();
        System.out.println(professionalAddressBook.contactList);
        professionalAddressBook.editContact();
        professionalAddressBook.deleteContact();
    }
}
