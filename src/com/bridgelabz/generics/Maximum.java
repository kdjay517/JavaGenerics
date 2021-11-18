package com.bridgelabz.generics;

import java.util.Scanner;

public class Maximum {
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		
		if (y.compareTo(x) > 0) {
			max = y;
		}
		
		if (z.compareTo(y) > 0) {
			max = z;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n1.To find maximum Integer\n2.To find maximum flot value"
					                     + "\n3.To find maximum String");
		switch (sc.nextInt()) {
			case 1:
				System.out.printf("\n maximum number in (3,5,8) is %d",Maximum.maximum(3, 5, 8));
				break;
			case 2:
				System.out.printf("\n maximum number in (3.2,5.8,1.2) is %.1f",Maximum.maximum(3.2, 5.8, 1.2));
				break;
			case 3:
				System.out.printf("\n maximum string in (apple,peach,banana) is %s",Maximum.maximum("apple", "peach", "banana"));

		}
				
	}

}
