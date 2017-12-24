package com.nanda.java.codingbat.string;

import java.util.Scanner;

public class WithoutString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			System.out.println(withoutString(scan.nextLine(), "1"));
		}
		
		scan.close();
		
	}
	
	public static String withoutString(String base, String remove) {
		
		String strAfterReplace ="";
		
		strAfterReplace = base.replaceAll(remove.toLowerCase(), "").replaceAll(remove.toUpperCase(), "").replaceAll(remove, "");
		
		
		
		return strAfterReplace;
		  
	}


}
