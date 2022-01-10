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
}

public class Regex {
	public static void main(String[] args) {

		UserRegistration user = new UserRegistration();
		user.firstName();
		user.lastName();

	}

}
