package com.kodnest.control_construct;
import java.util.Scanner;
public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter three numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		if((n1==n2)&&(n2==n3)) {
			System.out.println("Three numbers are equal");
		}
		else if(n1>n2 && n1>n3) {
			System.out.println(n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2);
		}
		else if(n3>n1 && n3>n2) {
			System.out.println(n3);
		}
	}

}
