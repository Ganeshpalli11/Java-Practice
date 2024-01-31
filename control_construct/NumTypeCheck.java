package com.kodnest.control_construct;

import java.util.Scanner;

public class NumTypeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Number");
		int num=scan.nextInt();
		if(num>0) {
			System.out.println("POSITIVE");
		}
		else if(num<0){
			System.out.println("NEGATIVE");
		}
	}

}
