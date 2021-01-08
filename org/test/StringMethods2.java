package org.test;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Application";
		//To check whether the string starts with 
		boolean i = s.startsWith("Ja");
		System.out.println(i);
		
		//To check whether the string ends with 
				boolean e = s.endsWith("tion");
				System.out.println(e);
		//To check whether the string CHAR is part of the word or not .
				
			 boolean f = s.contains("tion");
		     System.out.println(f);
		 	
		     //To replace a string with another string 
			String f1 = s.replace('i', 'Ö');
		     System.out.println(f1);
		     
		     
		     //To replace a whole string with another string 
				String m = s.replaceAll(s, "Selenium");
			     System.out.println(m);
			     
			     //To trim a string 
			     
			     String t = " Bright Sun  ";
			    String t1 = t.trim();
			     
			     System.out.println(t);
			     System.out.println(t1);
		     
	}
	
	

}
