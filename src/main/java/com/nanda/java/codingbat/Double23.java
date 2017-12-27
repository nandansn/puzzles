package com.nanda.java.codingbat;

public class Double23 {
	
	public static void main(String[] args) {
		
		System.out.println(double23(new int[] {}));
		
	}
	
	public static boolean double23(int[] nums) {
		
		boolean isDouble23 = false;
		
		if(nums.length < 2)
			return isDouble23;
		else {
			for (int i = 0; i < nums.length-1; i++) {
				if(nums[i] == 2 || nums[i] == 3 )
					if(nums[i] == nums[i+1])
						isDouble23 = true;
			}
		}
		
		
		return isDouble23;
		  
	}


}
