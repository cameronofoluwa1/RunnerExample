package comm.qa.runnerexample;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		question();
	}
	
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int division(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void question() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number (bigger) : ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number (smaller) : ");
        int num2 = scan.nextInt();
        System.out.println("What would you like to do?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        if(scan.nextInt() == 1) {
        	System.out.println(addition(num1, num2));
        }else if(scan.nextInt() == 2) {
        	System.out.println(subtraction(num1, num2));
        }else if(scan.nextInt() == 3) {
        	System.out.println(multiplication(num1, num2));
        }else if(scan.nextInt() == 4) {
        	System.out.println(division(num1, num2));
        }else {
        	System.out.println("Wrong input, oh well");
        }
	}

}
