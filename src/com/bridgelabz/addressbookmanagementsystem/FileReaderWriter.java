package com.bridgelabz.addressbookmanagementsystem;

import java.io.*;
import java.util.ArrayList;

public class FileReaderWriter {
    static final String PATH = "src/Resource.properties";
     void readTxtFile(File file) throws IOException {
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

}
