package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;


public class ContactService {
    List<Contact> contactList=new ArrayList<>();

   void addContact(Contact newContact) {

    for (Contact savedContact : contactList) {

        if (savedContact.getFirstName().equalsIgnoreCase(newContact.getFirstName())
                && savedContact.getLastName().equalsIgnoreCase(newContact.getLastName())) {

            System.out.println("Duplicate Entry! This person already exists in the AddressBook.");
            return;
        }
    }

    contactList.add(newContact);
    System.out.println("Contact Added Successfully.");
}

    void editContact(String firstName, String field, String newValue) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                switch (field.toLowerCase()) {
                    case "firstname":
                        contact.setFirstName(newValue);
                        System.out.println("First Name updated to: " + newValue);
                        break;
                    case "lastname":
                        contact.setLastName(newValue);
                        System.out.println("Last Name updated to: " + newValue);
                        break;
                    case "address":
                        contact.setAddress(newValue);
                        System.out.println("Address updated to: " + newValue);
                        break;
                    case "city":
                        contact.setCity(newValue);
                        System.out.println("City updated to: " + newValue);
                        break;
                    case "state":
                        contact.setState(newValue);
                        System.out.println("State updated to: " + newValue);
                        break;
                    case "zip":
                        contact.setZip(newValue);
                        System.out.println("Zip updated to: " + newValue);
                        break;
                    case "phonenumber":
                        contact.setPhoneNumber(newValue);
                        System.out.println("Phone Number updated to: " + newValue);
                        break;
                    case "email":
                        contact.setEmail(newValue);
                        System.out.println("Email updated to: " + newValue);
                        break;
                    default:
                        System.out.println("Invalid field: " + field);
                }
                return; 
            }
        }
        System.out.println("Contact with first name " + firstName + " not found.");
    }

    void deleteContact(String firstName){
        for(Contact contact:contactList){
            if(contact.getFirstName().equalsIgnoreCase(firstName)){
                contactList.remove(contact);
                System.out.println("Contact with first name " + firstName + " deleted.");
                return;
            }
        }
        System.out.println("Contact with first name " + firstName + " not found.");
    }

    void searchByCityOrState(String location) {

        for (Contact contact : contactList) {

            if (contact.getCity().equalsIgnoreCase(location) || contact.getState().equalsIgnoreCase(location)) {
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " - " + contact.getCity() + ", " + contact.getState());
            }
        }
    }

    void countByCityOrState(String location) {
        int count = 0;
        for (Contact contact : contactList) {
            if (contact.getCity().equalsIgnoreCase(location)|| contact.getState().equalsIgnoreCase(location)) {
                count++;
            }
      }
        System.out.println("Total contacts in " + location + " : " + count);
    }

    void sortContactsByName() {
        Collections.sort(contactList,
                Comparator.comparing(Contact::getFirstName, String.CASE_INSENSITIVE_ORDER));
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    void sortContactsByCity() {
        Collections.sort(contactList,
            Comparator.comparing(Contact::getCity, String.CASE_INSENSITIVE_ORDER));

        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    void sortContactsByState() {
        Collections.sort(contactList,
            Comparator.comparing(Contact::getState, String.CASE_INSENSITIVE_ORDER));
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    void sortContactsByZip() {
        Collections.sort(contactList,
            Comparator.comparing(Contact::getZip));
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    void writeContactsToFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (Contact contact : contactList) {
                writer.write(contact.toString() + System.lineSeparator());
            }
            writer.close();
            System.out.println("Contacts written to file successfully.");
        } 
        catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    void readContactsFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    void writeContactsToCSV(String fileName) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(fileName));
            for (Contact contact : contactList) {
                String[] data = {
                        contact.getFirstName(),
                        contact.getLastName(),
                        contact.getAddress(),
                        contact.getCity(),
                        contact.getState(),
                        contact.getZip(),
                        contact.getPhoneNumber(),
                        contact.getEmail()
                };
                writer.writeNext(data);
            }
            writer.close();
            System.out.println("Contacts written to CSV successfully.");

        }
        catch (Exception e) {
            System.out.println("Error writing CSV.");
        }
    }

    void readContactsFromCSV(String fileName) {
        try {
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String[] data;
            while ((data = reader.readNext()) != null) {
                System.out.println(data[0] + " " + data[1] + " | " + data[3] + " | " + data[4]);
            }
            reader.close();

        }
        catch (Exception e) {
            System.out.println("Error reading CSV.");
        }
    }

    void writeContactsToJSON(String fileName) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(fileName);
            gson.toJson(contactList, writer);
            writer.close();
            System.out.println("Contacts written to JSON successfully.");
        }
        catch (Exception e) {
            System.out.println("Error writing JSON file.");
        }
    }

    void readContactsFromJSON(String fileName) {
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader(fileName);
            Type type = new TypeToken<List<Contact>>() {}.getType();
            List<Contact> contacts = gson.fromJson(reader, type);
            if (contacts != null) {
                for (Contact contact : contacts) {
                    System.out.println(contact);
                }
            }
            reader.close();

        }
        catch (Exception e) {
            System.out.println("Error reading JSON file.");
        }
    }





}
