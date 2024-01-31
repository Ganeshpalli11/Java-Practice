package com.kodnest.control_construct;
import java.util.Scanner;

public class PositivePrint {
	public static boolean checkNum(int num) {
		if(num>0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int num=scan.nextInt();
		
if(checkNum(num)==true) {
	System.out.println(num);
}
else if(checkNum(num)==false) {
	System.out.println("ENETR ONLY POSITIVE NUMBER ABOVE 0");
}
	}

}
