package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class Sum28 {
	
	public boolean sum28(int[] nums) {
		  
		boolean isSum28 = false;
		
		if(nums.length < 4)
			return isSum28;
		
		if(nums.length == 4) {
			if(nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 2)
			{
				isSum28 = true;
				return isSum28;
			}
		}
		
		Arrays.sort(nums);
		int sum8 = 0;
		for (int i = 0; i < nums.length-3; i++) {
			if(nums[i] == 2)
			{
				sum8 = sum8 + nums[i];
				
			}
		}
		
		isSum28 = (sum8 == 8 ) ?  true :  false;
		
		return isSum28;
	}


}
