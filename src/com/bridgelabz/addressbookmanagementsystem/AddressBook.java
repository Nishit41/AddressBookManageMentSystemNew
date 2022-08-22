package com.bridgelabz.addressbookmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contactList = new ArrayList<>();
    Contact contact = new Contact();

    public void addContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Firstname");
        String firstName = sc.next();
        System.out.println("Enter Lastname");
        String lastname = sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter Zipcode");
        int zipcode = sc.nextInt();
        System.out.println("mobile Number");
        String mobileNumber = sc.next();
        System.out.println("email id");
        String emailId = sc.next();
        contact.setFirstName(firstName);
        contact.setLastName(lastname);
        contact.setCity(city);
        contact.setState(state);
        contact.setEmailId(emailId);
        contact.setMobileNumber(mobileNumber);
        contact.setZipCode(zipcode);
        contactList.add(contact);
    }
    public void editContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the firstname of person to edit");
        String firstName = scan.next();
        if (contact.getFirstName().equals(firstName)) {
            System.out.println("edit the details of person");
        } else {
            System.out.println("no need to edit");
        }
    }
}
