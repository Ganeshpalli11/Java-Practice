package com.kodnest.control_construct;
import java.util.Scanner;

public class CapitalLetterChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Capital Letter");
char ch = scan.next().charAt(0);; 
        
        if (isCapitalLetter(ch)) {
            System.out.println("Capital Letter");
        }
        else {
        	System.out.println("Not aCapital Letter");
        }
    }

    public static boolean isCapitalLetter(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
	}


