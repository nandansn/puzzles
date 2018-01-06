package com.nanda.java.codingbat.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FizArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(fizzArray(4).length);
		
		Arrays.stream(fizzArray(0)).forEach(i -> System.out.println(i));
	}
	
	
	public static int[] fizzArray(int n) {
		
		int[] newArray = new int[n];
		
			for (int i = 1; i <= n; i++) {
				newArray[i-1] =i-1;
			}
		
		return newArray;
		
		  
	}


}
