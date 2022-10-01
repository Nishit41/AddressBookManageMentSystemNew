package com.bridgelabz.addressbookmanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contactList = new ArrayList<>();
    Map dictCity = new HashMap<String, ArrayList<Contact>>();
    Map stateContactList  = new HashMap<String,ArrayList<Contact>>();

    static Scanner scanner = new Scanner(System.in);
    public void addContacts()
    {
        System.out.println("Enter first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        for(Contact contacts : contactList) {
            if (contacts.getFirstName().equals(firstName)) {
                System.out.println("contact already exists");
                return;
            }
        }
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact();
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

        public void deleteContact() {
        System.out.println("Enter First Name Of Contact that you want to delete");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(firstName)) {
                contactList.remove(contact);
                System.out.println("deleted successfully");
            } else {
                System.out.println("no need to delete");
            }
        }
    }
    void editContact() {
        System.out.println("enter the first name of a person to edit");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        for (Contact contact : contactList) {
            if (firstName.equals(contact.getFirstName()))
            {
                System.out.println("Edit the details of person: ");

                System.out.println("Edit first name: ");
                contact.setFirstName(scanner.next());

                System.out.println("Edit last name: ");
                contact.setLastName(scanner.next());

                System.out.println("Edit address: ");

                System.out.println("Edit city: ");
                contact.setCity(scanner.next());

                System.out.println("Edit state: ");
                contact.setState(scanner.next());

                System.out.println("Edit zip code: ");
                contact.setZipCode(scanner.nextInt());

                System.out.println("Edit phone number:");
                contact.setMobileNumber(scanner.nextLine());

                System.out.println("Edit email: ");
                contact.setEmailId(scanner.nextLine());
            }
            else {
                System.out.println("person not found");
            }
        }

    }
    public  void showDetails(ArrayList<Contact> contactList) {
        for(Contact contact : this.contactList){
            System.out.println(contact.toString());
        }
    }

    void searchContact(){
        if(contactList.isEmpty()){
            System.out.println("No contact to search in addressbook");
            return;
        }
        boolean exit = false;
        while (!exit){
            System.out.println("""
                Enter option
                1) To search by City
                2) To search by State
                3) To exit
                """);
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the city to search contact");
                    String city = scanner.next();
                    for(Contact contacts : contactList){
                        if(contacts.getCity().contains(city)){
                            System.out.println(contacts);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the stateName to search contact");
                    String state = scanner.next();
                    for (Contact contacts : contactList){
                        if(contacts.getState().contains(state)){
                            System.out.println(contacts);
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                         break;
            }
        }
    }
    void viewContact(){
        System.out.println("\n" +
                "1)View by City " +
                "\n" +
                "2.View by State");
        switch (scanner.nextInt()) {
            case 1:
                viewContactByCity();
                break;
            case 2:
                viewContactByState();
                break;
            default:
                viewContact();
                break;

        }
    }

    void viewContactByCity(){
        System.out.println("enter city name");
        Scanner sc = new Scanner(System.in);
        String  cityName = sc.next();
        if (dictCity.containsKey(cityName)) {
            contactList = (ArrayList<Contact>)dictCity.get(cityName);
        }
        dictCity.put(cityName, contactList);
        System.out.println(dictCity);
    }


    void viewContactByState(){
        System.out.println("enter state name");
        Scanner sc = new Scanner(System.in);
        String  stateName = sc.next();
        if (dictCity.containsKey(stateName)) {
            contactList = (ArrayList<Contact>)dictCity.get(stateName);
        }
        dictCity.put(stateName, contactList);
        System.out.println(dictCity);
    }
   @Override
    public String toString() {
        return "AddressBook{" +
                "contactList=" + contactList +
                '}';
    }
}



