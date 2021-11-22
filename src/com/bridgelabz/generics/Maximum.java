package com.bridgelabz.generics;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.To find maximum Integer\n2.To find maximum flot value" + "\n3.To find maximum String");
		switch (sc.nextInt()) {
		case 1:
			System.out.printf("\n maximum number in (3,5,8) is %d", MaximumTest.findMaximum(3, 5, 8));
			break;
		case 2:
			System.out.printf("\n maximum number in (3.2,5.8,1.2) is %.1f", MaximumTest.findMaximum(3.2, 5.8, 1.2));
			break;
		case 3:
			System.out.printf("\n maximum string in (apple,peach,banana) is %s",
					MaximumTest.findMaximum("apple", "peach", "banana"));
		}
	}
}

