package com.bridgelabz.addressbookmanagementsystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public class FileReaderWriter {
    static final String PATH = "src/main/resources";
     void readTxtFile(String addressBookName) throws IOException {
         File file = new File(PATH + addressBookName + ".txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String string;
        while ((string = bufferedReader.readLine()) != null)
            System.out.println(string);
    }
    public  void writeTxt(ArrayList<Contact> list, String addressBookName) throws IOException {
        File file = new File(PATH + addressBookName + ".txt");
        FileWriter fileWriter = new FileWriter(file);
        String contactDataString = "";
        for (Contact contacts : list)
            contactDataString = contactDataString.concat(contacts.toString().concat("\n"));
        fileWriter.write(contactDataString);
        fileWriter.close();
    }

    public void writeCSV(ArrayList<Contact> list, String addressBookName) throws IOException {
        File file = new File(PATH + addressBookName + ".csv");
        FileWriter fileWriter = new FileWriter(file);
        CSVWriter csvWriter = new CSVWriter(fileWriter);
        List<String[]> data = new ArrayList<>();
        String[] heading = new String[]{ "FIRST_NAME", "LAST_NAME", "CITY", "STATE", "", "PHONE_NUMBER", "EMAIL"};
        csvWriter.writeNext(heading);
        for (Contact contacts : list) {
            String[] contactData = new String[]{contacts.getFirstName(), contacts.getLastName(),  contacts.getCity(), contacts.getState(), String.valueOf(contacts.getZipCode()), contacts.getMobileNumber(), contacts.getEmailId()};
            data.add(contactData);
        }
        csvWriter.writeAll(data);
        fileWriter.close();
    }
    void readCSVFile(String addressBookName ) throws IOException {
        File file = new File(PATH  + addressBookName+".csv");
        Scanner scanner = new Scanner(file);
         scanner.useDelimiter(",");
         while (scanner.hasNext()) {
            System.out.print(scanner.next());
        }
        scanner.close();
    }


}
