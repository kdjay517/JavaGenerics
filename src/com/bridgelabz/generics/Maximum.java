package com.bridgelabz.generics;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.To find maximum Integer\n2.To find maximum flot value" + "\n3.To find maximum String");
		switch (sc.nextInt()) {
		case 1:
			Integer[] inputArray1 = { 1, 2, 3, 4, 5 };
	        int finalResult1 = MaximumTest.findMaximum(inputArray1);
	        Integer[] inputArray2 = { 63, 71, 84, 96 ,59};
	        int finalResult2 = MaximumTest.findMaximum(inputArray2);
	        Integer[] inputArray3 = { 876, 394, 675, 942, 239, 596 };
	        int finalResult3 = MaximumTest.findMaximum(inputArray3);
			System.out.printf("{ 1, 2, 3, 4, 5 } Maximum Interger Number is:%d",finalResult1);
			System.out.printf("\n{ 63, 71, 84, 96 ,59} Maximum Integer Number is:%d",finalResult2);
			System.out.printf("\n{ 876, 394, 675, 942, 239, 596 } Maximum Integer Number is:%d",finalResult3);
			break;
		case 2:
			Float[] inputfloatArray1 = { 2.9f, 9.1f, 8.3f, 4.6f, 3.7f};
	        float floatResult1 = MaximumTest.findMaximum(inputfloatArray1);
	        Float[] inputfloatArray2 = { 10.12f, 24.56f, 53.2f, 67.2f, 55.7f };
	        float floatResult2 = MaximumTest.findMaximum(inputfloatArray2);
	        Float[] inputfloatArray3 = { 369.4f, 473.5f, 161.9f, 892.4f, 781.6f };
	        float floatResult3 = MaximumTest.findMaximum(inputfloatArray3);
	        System.out.printf("{ 2.9f, 9.1f, 8.3f, 4.6f, 3.7f} Maximum Float Number is:%.1f",floatResult1);
			System.out.printf("\n{ 10.12f, 24.56f, 53.2f, 67.2f, 55.7f } Maximum Float Number is:%.1f",floatResult2);
			System.out.printf("\n{ 369.4f, 473.5f, 161.9f, 892.4f, 781.6f } Maximum Float Number is:%.1f",floatResult3);
			break;
		case 3:
			String[] stringArray1 = { "Peach", "Apple", "Banana", "Mango", "Grape" };
	        String stringResult1 = MaximumTest.findMaximum(stringArray1);
	        String[] stringArray2 = { "Grape", "Peach", "Mango", "Apple", "Banana" };
	        String stringResult2 = MaximumTest.findMaximum(stringArray2);
	        String[] stringArray3 = { "Mango", "Peach", "Apple", "Grape", "Banana" };
	        String stringResult3 = MaximumTest.findMaximum(stringArray3);
	        System.out.printf("{ \"Peach\", \"Apple\", \"Banana\", \"Mango\", \"Grape\" } Maximum String is:%s",stringResult1);
			System.out.printf("\n{ \"Grape\", \"Peach\", \"Mango\", \"Apple\", \"Banana\" } Maximum String is:%s",stringResult2);
			System.out.printf("\n{ \"Mango\", \"Peach\", \"Apple\", \"Grape\", \"Banana\" } Maximum String is:%s",stringResult3);
		}

	}

}