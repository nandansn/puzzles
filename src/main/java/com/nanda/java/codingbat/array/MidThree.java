package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class MidThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays.stream(midThree(new int[] {1, 2, 3, 4, 5})).forEach(i -> System.out.println(i));

	}
	
	public static int[] midThree(int[] nums) {
		  
		int[] newArray = new int[3];
		
		int newArrayStart = (nums.length / 2) -1 ;
		
		newArray[0] = nums[newArrayStart];
		newArray[1] = nums[newArrayStart+1];
		newArray[2] = nums[newArrayStart+2];
		
		return newArray;
	}


}
