package org.test;

public class StringMethods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to check whether two strings are equal
		
		String s= "Java";
		String s1= "java";
		boolean o = s.equals(s1);
		System.out.println(o);
		
		// without checking the case sensitivity
		boolean p = s.equalsIgnoreCase(s1);
		System.out.println(p);
		
		// to join two strings
		String z = s.concat(s1);
		System.out.println(z);
		
		// to get another string 
		String s2 = "Hi welcome to testing course";
		String f = s2.substring(6);
		System.out.println(f);
	}

}
