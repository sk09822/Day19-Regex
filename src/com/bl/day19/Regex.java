package com.bl.day19;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {
	Scanner sc = new Scanner(System.in);

	public void firstName() {
		System.out.println("Enter First Name ::  ");
		String FirstName = sc.next();
		boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", FirstName);
		if (answer) {
			System.out.println("Thank you");
		} else {
			System.out.println("Please Enter Valid First Name");

		}

	}

	public void lastName() {

		System.out.print("Enter Last Name :: ");
		String LastName = sc.next();
		Boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", LastName);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid last name ");
		}

	}

	public void email() {

		System.out.print("Enter email ID :: ");
		String Email = sc.next();
		Boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@bl[.]co([.]in)*", Email);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid email ID ");
		}

	}

	public void contactNumber() {

		System.out.print("Enter contact number with country code (91)  :: ");
		String ContactNumber = sc.next();
		boolean answer = Pattern.matches("91\\s[0-9]{10}", ContactNumber);
		if (answer) {
			System.out.println("Thank you");
		} else {
			System.out.println("enter valid contact number");
		}

	}
}

public class Regex {
	public static void main(String[] args) {

		UserRegistration user = new UserRegistration();
		user.firstName();
		user.lastName();
		user.email();
		user.contactNumber();

	}
}
