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
			System.out.println("1: For add new Address");

			int option = scan.nextInt();
			switch (option) {
			case 1:
				contactPerson = addressBookOperation.newAddressBook();
				System.out.println(addressBookOperation.save(contactPerson.getPhone(), contactPerson));
				break;

			default:
				System.out.println("Please select valid option");
				break;

			}

		}

	}
}
