package com.jspider.designpatterns.creational;

public class Contact {
	private String firstName;
	private String lastName;
	private long mobile;
	private String email;
	private String address;
	private String dob;
	private long work;
	
	public Contact(String firstName, String lastName, long mobile, String email, String address, String dob,
			long work) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.dob = dob;
		this.work = work;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile + ", email=" + email
				+ ", address=" + address + ", dob=" + dob + ", work=" + work + "]";
	}
	
	

}
