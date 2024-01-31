package com.kodnest.control_construct;
import java.util.Scanner;

public class EvenNumOfN {
	public static void even(int n) {
		System.out.print("Even Numbers: ");
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=scan.nextInt();
		even(n);

	}

}
