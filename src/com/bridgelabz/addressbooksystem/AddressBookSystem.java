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
    public int indexOfPerson()
    {
        System.out.println();
        String name=readString("Enter Person's firstName: ");
        int index=0;
        for(Contact contact : this.data)
        {
            if(contact.getFirstName().equals(name))
            {
                return index;
            }
            ++index;
        }
        return -1;
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
    public void editPerson()
    {
        int index=this.indexOfPerson();
        if(index != -1)
        {
            String options="\tWhat you want to change?\n\t1. City\n\t2. State\n\t3. Address\n\t4. Zip Code\n\t" +
                    "5. PhoneNumber\n: ";
            int choice=(int)readLong(options);

            switch(choice)
            {
                case 1:
                    this.data.get(index).setCity(readString("Enter new City: "));
                    System.out.println("\tEntry Modified");
                    break;
                case 2:
                    this.data.get(index).setState(readString("Enter new State: "));
                    System.out.println("\tEntry Modified");
                    break;
                case 3:
                    this.data.get(index).setAddress(readString("Enter new Address: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 4:
                    this.data.get(index).setZipCode(readLong("Enter new Zip Code: "));
                    System.out.println("\tEntry Modified");
                    break;
                case 5:
                    this.data.get(index).setPhoneNumber(readLong("Enter new Phone number: "));
                    System.out.println("\tEntry Modified");
                    break;
                default:
                    System.out.println("\n\tBad Input!");
            }
        }
        else
        {
            System.out.println("\n\tNo such person found!");
        }
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
        addressBookSystem.editPerson();
    }
}
