package com.nanda.java.codingbat.array;

import java.util.Arrays;

import javafx.util.converter.NumberStringConverter;

public class MaxTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxTriple(new int[] { 1, 7, 3,5 }));
	}

	public static int maxTriple(int[] nums) {

		int[] newSubArray = new int[3];
		
		

		if (nums.length > 3) {

			newSubArray[0] = nums[0];
			newSubArray[1] = nums[(int) (Math.ceil((nums.length / 2)) )];
			newSubArray[2] = nums[nums.length - 1];
			
			Arrays.sort(newSubArray);
			
			return newSubArray[newSubArray.length-1];
		}

		Arrays.sort(nums);

		return nums[nums.length - 1];
	}

}
