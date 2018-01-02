package com.nanda.java.codingbat.array;

public class ZeroFront {
	
	public static void main(String[] args) {
		
		for (int num : zeroFront(new int[] {1,0,})) {
			
			System.out.println(num);
			
		}
	}
	
	public static int[] zeroFront(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]  != 0) {
				for (int j = i+1; j < nums.length; j++) {
					
					if(nums[j] == 0) {
						nums[j] = nums[i];
						nums[i] = 0;
						
					}
				}
			}
			
		}
		
		return nums;
		  
	}


}
