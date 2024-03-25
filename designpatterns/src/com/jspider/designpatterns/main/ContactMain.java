package com.jspider.designpatterns.main;

import com.jspider.designpatterns.creational.Contact;
import com.jspider.designpatterns.creational.ContactBuilder;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact = new ContactBuilder().setFirstName("Akash").setEmail("example@gmail.com").setMobile(897834110)
				.buildContact();
		System.out.println(contact);
	}
}
