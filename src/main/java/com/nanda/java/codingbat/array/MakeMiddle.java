package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class MakeMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays.stream(makeMiddle(new int[] {1, 2})).forEach(i -> System.out.println(i));

	}
	
	public static int[] makeMiddle(int[] nums) {
		
		
		
		int middleToStart = (nums.length / 2)  - 1;
		int middleToEnd = middleToStart + 1;
		
		int[] newArray = new int[2];
		
		newArray[0] = nums[middleToStart];
		newArray[1] = nums[middleToEnd];
		
		return newArray;
		  
	}


}
