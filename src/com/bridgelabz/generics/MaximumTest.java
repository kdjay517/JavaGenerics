package com.bridgelabz.generics;

public class MaximumTest {
	
	public String maximum (String a, String b,String c) {
		
		String max = a;
		
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		
		return max;
	}

}
