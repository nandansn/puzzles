package com.nanda.java.codingbat.array;

public class More14 {
	
	public boolean more14(int[] nums) {
		
		int countOne =0;
		int countFour =0;
		
		boolean isMore14 = false;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				countOne++;
			} else if(nums[i] == 4) {
				countFour++;
			}
		}
		
		isMore14 = (countOne > countFour) ? true : false;
		
		return isMore14;
		  
	}


}
