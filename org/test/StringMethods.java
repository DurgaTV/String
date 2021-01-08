package org.test;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Java Application";
		// To find the length 
		
		int a = s.length();
		System.out.println(a);
		
		// To check whether the String is empty or not !
		boolean e = s.isEmpty();
		System.out.println(e);
		
		// TO find a particular character.
		
		char c = s.charAt(2);
		System.out.println(c);
		
		// To find the index position
		int d = s.indexOf('a');
		System.out.println(d);
		
		int d1 = s.indexOf('v');
		System.out.println(d1);
		
		int d2 = s.indexOf('z');
		System.out.println(d2);
		
		//To find the last index position 
		
		int f = s.lastIndexOf('a');
		System.out.println(f);
		
		// TO find capital Letters 
		
		String r =s.toUpperCase();
		System.out.println(r);
		
		// TO find small Letters 
		
		String l =s.toLowerCase();
		System.out.println(l);
		
		
		
		
	}

}
