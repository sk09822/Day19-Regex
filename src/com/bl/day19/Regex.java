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
}

public class Regex {
	public static void main(String[] args) {

		UserRegistration user = new UserRegistration();
		user.firstName();

	}

}
