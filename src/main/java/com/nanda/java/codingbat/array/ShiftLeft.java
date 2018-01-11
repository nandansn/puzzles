package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class ShiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays.stream(shiftLeft(new int[] {1})).forEach(i -> System.out.println(i));

	}
	
	
	public static int[] shiftLeft(int[] nums) {
		
		int[] newArray = new int[nums.length];
		
		for (int i = 1; i < newArray.length; i++) {
			
			newArray[i-1] = nums[i];
		}
		
		if(nums.length > 0) {
		
		newArray[nums.length-1] = nums[0];
		}
		
		return newArray;
		  
	}


}
