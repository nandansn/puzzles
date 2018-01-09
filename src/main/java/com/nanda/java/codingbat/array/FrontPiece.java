package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class FrontPiece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Arrays.stream(frontPiece(new int[] {1,2,3})).forEach(i -> System.out.println(i));
	}
	
	public static int[] frontPiece(int[] nums) {
		
		if(nums.length > 2) {
		  
		int[] newArray = new int[2];
		
		newArray[0] = nums[0];
		newArray[1] = nums[1];
		
		return newArray;
		}
		
		
		return nums;
	}


}
