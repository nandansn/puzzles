package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class TenRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays.stream(tenRun(new int[] {10, 1, 9, 20})).forEach(i -> System.out.println(i));

	}
	
	public static int[] tenRun(int[] nums) {
		
		int multipleoFTen =0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] % 10  == 0) {
				
				multipleoFTen = nums[i];
				
			} else if(multipleoFTen != -1) {
				
				nums[i] = multipleoFTen;
			}
			
		}
		
		return nums;
		  
	}


}
