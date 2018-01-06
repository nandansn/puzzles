package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class Only14 {
	
	public static void main(String[] args) {
		
		System.out.println(only14(new int[] {1,4,1,4}));
		
	}
	
	public static boolean only14(int[] nums) {
		  
		boolean isOnly14 = true;
		
			for (int  i : nums) {
				
				if(i!=1 && i!=4) {
					isOnly14 = false;
					break;
				}
				 
			}
		
		return isOnly14;
	}


}
