package com.kodnest.control_construct;

import java.util.Scanner;

public class AdultCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter age");
		int age=scan.nextInt();
		if(age>21) {
			System.out.println("Person is Adult");
		}
		else {
			System.out.println("Person is not-Adult");
		}
	}

}
