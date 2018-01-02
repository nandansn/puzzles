package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class Lucky13 {
	
	public boolean lucky13(int[] nums) {
		
		boolean isLucky  = true;
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1 || nums[i] == 3) {
				isLucky = false;
				break;
			}
		}
		
		return isLucky;
		  
	}

	

}
