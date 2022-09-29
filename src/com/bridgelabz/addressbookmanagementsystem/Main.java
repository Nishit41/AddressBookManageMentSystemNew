package com.bridgelabz.addressbookmanagementsystem;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final String PROFESSIONAL_ADDRESS_BOOK = "professional address book";
    static final String FAMILY_ADDRESS_BOOK = "family address book";
    public static void main(String[] args) throws IOException {
        Map<String, AddressBook> addressBookMap = new HashMap<>();
        AddressBook professionalAddressBook = new AddressBook();
        AddressBook familyAddressBook = new AddressBook();
//        professionalAddressBook.addContacts();
//        System.out.println(professionalAddressBook);

        //  System.out.println(professionalAddressBook);
        // professionalAddressBook.editContact();
        // professionalAddressBook.deleteContact();
//        professionalAddressBook.editContact();
//        professionalAddressBook.searchContact();
        addressBookMap.put(PROFESSIONAL_ADDRESS_BOOK, professionalAddressBook);
        addressBookMap.put(FAMILY_ADDRESS_BOOK, professionalAddressBook);

         Scanner scr = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("Enter options\n 1->to addContacts in professionalAddressBook \n 2 -> To add contacts in familyAddressBook" +
                    "\n 3->To edit contact in professionalAddressBook \n 4->To edit contacts in familyAddressBook \n " +
                    "5->to delete contact in professionalAddressBook" +
                    "\n 6->to search contact in professionalAddressBook \n 7->to delete contact in family AddressBook \n 8->to search contact in family asdrressbok" +
                    "\n 9-> to view contact in familyAddressBook \n 10 ->to view contact in professional addressbook" + "\n 11 -> exit");

            int option = scr.nextInt();
            switch (option) {
                case 1:
                    addressBookMap.get(PROFESSIONAL_ADDRESS_BOOK).addContacts();
                    break;
                case 2:
                    addressBookMap.get(FAMILY_ADDRESS_BOOK).addContacts();
                    break;
                case 3:
                    addressBookMap.get(PROFESSIONAL_ADDRESS_BOOK).editContact();
                    break;
                case 4:
                    addressBookMap.get(FAMILY_ADDRESS_BOOK).editContact();
                    break;
                case 5:
                    addressBookMap.get(PROFESSIONAL_ADDRESS_BOOK).deleteContact();
                    break;
                case 6:
                    addressBookMap.get(PROFESSIONAL_ADDRESS_BOOK).searchContact();
                    break;
                case 7:
                    addressBookMap.get(FAMILY_ADDRESS_BOOK).deleteContact();
                case 8:
                    addressBookMap.get(FAMILY_ADDRESS_BOOK).searchContact();
                case 9:
                    addressBookMap.get(FAMILY_ADDRESS_BOOK).viewContact();
                case 10:
                    addressBookMap.get(PROFESSIONAL_ADDRESS_BOOK).viewContact();
                case 11:
                    exit = false;
                default:
                    break;
            }
        } while (exit);
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
//        fileReaderWriter.readTxtFile();
        fileReaderWriter.writeTxt(professionalAddressBook.contactList,PROFESSIONAL_ADDRESS_BOOK);
    }
}
