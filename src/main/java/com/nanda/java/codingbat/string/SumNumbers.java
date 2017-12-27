package com.nanda.java.codingbat.string;

public class SumNumbers {
	
	public static void main(String[] args) {
		
		System.out.println(sumNumbers("7 11"));
		
	}
	
	
	public static int sumNumbers(String str) {
		
		int sumNumbers =0;
		
		StringBuilder sb  = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				sb.append(str.charAt(i));
			}else if (sb.length() > 0){
				sumNumbers = sumNumbers + Integer.parseInt(sb.toString());
				sb  = new StringBuilder();
			}
			
			
			
		}
		
		if (sb.length() > 0){
			sumNumbers = sumNumbers + Integer.parseInt(sb.toString());
			
		}
		
		return sumNumbers;
		  
	}

}
