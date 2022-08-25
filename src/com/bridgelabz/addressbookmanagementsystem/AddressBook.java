package com.bridgelabz.addressbookmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contactList = new ArrayList<>();


    public void addContacts()
    {
        Scanner sc = new Scanner(System.in);
        Contact contact =  new Contact();
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
        System.out.println("Enter the firstname of person to edit");
        Scanner sc = new Scanner(System.in);
        String firstNameToEdit = sc.next();
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(firstNameToEdit)) {
                System.out.println("Enter firstname");
                String firstName = sc.next();
                contact.setFirstName(firstName);

                System.out.println("Enter secondName");
                String secondName = sc.next();
                contact.setLastName(secondName);

                System.out.println("Enter MobileNumber");
                String mobileNumber = sc.next();
                contact.setLastName(mobileNumber);

                System.out.println("Enter city -> ");
                String city = sc.next();
                contact.setCity(city);

                System.out.println("Enter state -> ");
                String state = sc.next();
                contact.setState(state);
            }
        }
    }
    public void deleteContact()
        {
        System.out.println("Enter First Name Of Contact that you want to delete");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        for (Contact contact: contactList) {
            if (contact.getFirstName().equals(firstName)) {
                contactList.remove(contact);
                System.out.println("deleted successfully");
            }
            else {
                System.out.println("no need to edit");
            }
        }
     }
}
