package com.bridgelabz.addressbookmanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static final String PROFESSIONAL_ADDRESS_BOOK = "professional address book";
    static final String FAMILY_ADDRESS_BOOK = "family address book ";
    public static void main(String[] args) {
        Map<String,AddressBook> addressBookMap = new HashMap<>();
        AddressBook professionalAddressBook = new AddressBook();
        AddressBook familyAddressBook = new AddressBook();
        professionalAddressBook.addContacts();
        System.out.println(professionalAddressBook.contactList);
        professionalAddressBook.editContact();
        professionalAddressBook.deleteContact();
        addressBookMap.put(PROFESSIONAL_ADDRESS_BOOK,professionalAddressBook);
        addressBookMap.put(FAMILY_ADDRESS_BOOK,familyAddressBook);
    }
}
