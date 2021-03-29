package com.viswa.genericClass;

public class Contact {

	private String salutation;
	private String fName;
	private String lName;
	private String contactNumber;
	public Contact() {
		super();
	}
	public Contact(String salutation, String fName, String lName, String contactNumber) {
		super();
		this.salutation = salutation;
		this.fName = fName;
		this.lName = lName;
		this.contactNumber = contactNumber;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Contact [salutation=" + salutation + ", fName=" + fName + ", lName=" + lName + ", contactNumber="
				+ contactNumber + "]";
	}
	
	
}
