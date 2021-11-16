package com.bridgelabz.generics;
import java.util.*;

public class Maximum {
	public static int num1;
	public static int num2;
	public static int num3;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MaximumTest maximumInteger = new MaximumTest();
		System.out.println("welcome to find maximum Number");
		System.out.println("Enter first Number:");
		num1 = sc.nextInt();
		System.out.println("Enter second Number:");
		num2 = sc.nextInt();
		System.out.println("Enter third Number:");
		num3 = sc.nextInt();
		System.out.printf("maximum Number in %d,%d,%d is %d:", num1,num2,num3,maximumInteger.maximum(num1, num2, num3));	
	}
}
