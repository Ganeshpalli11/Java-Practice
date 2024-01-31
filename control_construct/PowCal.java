package com.kodnest.control_construct;
import java.util.Scanner;
public class PowCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter value of num");
int num=scan.nextInt();
System.out.println("enter value of Pow");
int pow=scan.nextInt();
int x=(int)Math.pow(num, pow);
System.out.println(x);
	}

}
