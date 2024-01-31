package com.kodnest.control_construct;
import java.util.Scanner;

public class NumTable {
	public static void calTable(int num) {
		for(int i=1;i<=5;i++) {
			System.out.println(num+"*"+i+"="+(num*i)+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		calTable(num);
	}

}
