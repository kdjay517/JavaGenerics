package com.bridgelabz.generics;
import java.util.*;

public class Maximum {
	public static String string1;
	public static String string2;
	public static String string3;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MaximumTest maximumInteger = new MaximumTest();
		System.out.println("welcome to find maximum Number");
		System.out.println("Enter first Number:");
		string1 = sc.next();
		System.out.println("Enter second Number:");
		string2 = sc.next();
		System.out.println("Enter third Number:");
		string3 = sc.next();
		System.out.printf("maximum Number in %s,%s,%s is %s:", string1,string2,string3,maximumInteger.maximum(string1, string2, string3));	
	}
}
