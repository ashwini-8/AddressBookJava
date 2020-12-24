package com.Project.AddressBook;

public class AddressBookContactDetails {

	private String firstName;
	private String lastName;
	private String Address;
	private String city;
	private String state;
	private int zip;
	private long phone;

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public  String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "AddressBook{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", Address='"
				+ Address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zip=" + zip + ", phone="
				+ phone + '}';
	}
}
