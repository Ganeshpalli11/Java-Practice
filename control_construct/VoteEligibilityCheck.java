package com.kodnest.control_construct;

import java.util.Scanner;

public class VoteEligibilityCheck {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter age");
	int age=scan.nextInt();
	if(age>18) {
		System.out.println("Person is Eligible to Vote");
	}
	else {
		System.out.println("Person is not Eligible to Vote");
	}
}
}
