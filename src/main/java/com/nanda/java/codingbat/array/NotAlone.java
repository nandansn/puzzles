package com.nanda.java.codingbat.array;

public class NotAlone {
	
	public static void main(String[] args) {
		
		for (int num : notAlone(new int[] {1,3,1,2}, 1)) {
			System.out.println(num);
		}
		
	}
	
	public static int[] notAlone(int[] nums, int val) {
		
		for (int i = 1; i < nums.length -1; i++) {
			
			if(nums[i] == val) {
				if(nums[i] != nums[i+1] && nums[i] != nums[i-1] ) {
					nums[i] = (nums[i+1] > nums[i-1]) ? nums[i+1]:nums[i-1];
				}
			}
		}
		  
		return nums;
	}


}
