package com.kodnest.control_construct;

import java.util.Scanner;

public class PassCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter grade");
		int grade=scan.nextInt();
		if(grade>50) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}

}
