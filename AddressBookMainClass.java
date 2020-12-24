package com.Project.AddressBook;

import java.util.Scanner;

public class AddressBookMainClass {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program");
		Scanner scan = new Scanner(System.in);
		AddressBookContactDetails contactPerson = new AddressBookContactDetails();
		AddressBookOperations addressBookOperation = new AddressBookOperations();

		boolean terminate = false;
		while (terminate != true) {
			System.out.println("1: To add new Contact person");
			System.out.println("2: To Print all information");
			System.out.println("3: To Update the existing information");
			System.out.println("4: To Delete the contact");
			System.out.println("5: To short the Address First Name");
			System.out.println("6: To sort the Address by Zip Code");
			System.out.println("7: Search by city");
			System.out.println("8: Search by State");

			int option = scan.nextInt();
			switch (option) {
			case 1:
				contactPerson = addressBookOperation.newAddressBook();
				System.out.println(addressBookOperation.save(contactPerson.getPhone(), contactPerson));
				break;
			case 2:
				addressBookOperation.printAllDetails();
				break;
			case 3:
				System.out.println("enter the Phone Number to update");
				long key = scan.nextLong();
				contactPerson = addressBookOperation.newAddressBook();
				addressBookOperation.updateValue(key, contactPerson);
				break;
			case 4:
				System.out.println("Enter the Phone Number to delete address");
				long phoneToDelete = scan.nextLong();
				addressBookOperation.deleteAddress(phoneToDelete);
				break;
			case 5:
				addressBookOperation.sortByfirstName();
				break;
			case 6:
				addressBookOperation.sortByZipCode();
				break;
			case 7:
				System.out.println("enter the City to Search");
				String inputcity = scan.next();
                addressBookOperation.searchByCity(inputcity,contactPerson);
				break;
			case 8:
				System.out.println("enter the State to Search");
				String inputState = scan.next();
                addressBookOperation.searchByState(inputState,contactPerson);
				break;
			default:
				System.out.println("Please select valid option");
				break;

			}

		}

	}
}
