package com.kodnest.control_construct;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("PO1-ThumsUp,P02-MAAZA,P03-COKE");
		System.out.println("Enter Code for product you want");
		String code=scan.nextLine();
		switch(code) {
		case "P01":
			System.out.println("ThumsUp");
			break;
		case "P02":
			System.out.println("MAAZA");
			break;
		case "P03":
			System.out.println("coke");
			break;
		default:
			System.out.println("WATER");



		}

	}

}
