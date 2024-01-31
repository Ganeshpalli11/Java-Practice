package com.kodnest.control_construct;

import java.util.Scanner;

public class MulCheckFor10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Number");
		int num=scan.nextInt();
		if(10%num==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
