package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class Pre4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays.stream(pre4(new int[] {4,1,1})).forEach(i -> System.out.println(i));

	}
	public static int[] pre4(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 4) {
			  
			  if(i == 0) {
				
				return new int[0];
			}

				int[] newArray = new int[i];

				for (int j = 0; j <= i-1; j++) {

					newArray[j] = nums[j];
				}

				return newArray;
			}  

		}
		
		return nums;
	}
}
