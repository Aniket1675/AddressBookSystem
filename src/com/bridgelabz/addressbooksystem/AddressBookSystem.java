package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem
{
    private ArrayList<Contact> data=new ArrayList<Contact>();

    //Utility Methods to Facilitate Operations
    public String readString(String displayMessage)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(displayMessage);
        String input=scanner.nextLine();
        return input;
    }
    public long readLong(String displayMessage)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(displayMessage);
        long input=scanner.nextLong();
        return input;
    }
    public void addPerson()
    {
        System.out.println();
        String firstName=readString("Enter Person's first name: ");
        String lastName=readString("Enter Person's last name: ");
        String address=readString("Enter full address: ");
        String city=readString("Enter the City: ");
        String state=readString("Enter State: ");
        long zipCode=readLong("Enter area's Zip Code: ");
        long phoneNumber=readLong("Enter phone number: ");
        String email=readString("Enter email: ");
        Contact newEntry=new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);

        this.data.add(newEntry);
        System.out.println("record added successfully to address book.");
    }
    public void showAllPersons()
    {

        for(Contact contact : this.data)
        {
            contact.showPersonsDetails();

        }
        if(this.data.isEmpty())
        {
            System.out.println("\n\n[*]\t\tAddress Book is empty!\t\t\n");
        }
    }

    public static void main(String[] args)
    {
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        addressBookSystem.addPerson();
        addressBookSystem.showAllPersons();
    }
}
