package com.kodnest.control_construct;

import java.util.Scanner;

public class AllOperations {
	public static void divBy2(int n) {
		System.out.print("Numbers divisible by 2: ");
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void divBy3(int n) {
		System.out.print("Numbers divisible by 3: ");
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void divBy5(int n) {
		System.out.print("Numbers divisible by 5: ");
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	public static void divBy2and5(int n) {
		System.out.print("Numbers divisible by 2 and 5: ");
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0 && i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	public static void divBy3and5(int n) {
		System.out.print("Numbers divisible by 3 and 5: ");
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0 && i%3==0) {
				System.out.print(i + " ");
			}
		}
     System.out.println();
	}
   public static void prime(int n) {
		System.out.print("prime Numbers : ");
		for (int i = 2; i <= n; i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if ((i%j)==0){ 
					isPrime=false;
					break;
				}}
			if(isPrime) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
   public static void divBy3Even(int n) {
		System.out.print("Numbers divisible by 3 and even numbers: ");
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 && i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
   public static void divBy5Odd(int n) {
		System.out.print("Numbers divisible by 5 and Odd numbers: ");
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0 && i%2!=0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
   public static void primeEven(int n) {
		System.out.print("Even prime Numbers : ");
		for (int i = 2; i <= n; i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if ((i%j)==0){ 
					isPrime=false;
					break;
				}}
			if(isPrime && i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
   public static void primeOdd(int n) {
		System.out.print("Odd prime Numbers : ");
		for (int i = 2; i <= n; i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if ((i%j)==0){ 
					isPrime=false;
					break;
				}}
			if(isPrime && i%2!=0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
   
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		divBy2(n);
		divBy3(n);
		divBy5(n);
		divBy2and5(n);
		divBy3and5(n);
		prime(n);
		divBy3Even(n);
		divBy5Odd(n);
		primeEven(n);
		primeOdd(n);
	}
}
