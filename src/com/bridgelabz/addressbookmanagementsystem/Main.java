package com.bridgelabz.addressbookmanagementsystem;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContacts();
        System.out.println(addressBook.arrayList);
    }
}
