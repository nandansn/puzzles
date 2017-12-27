package com.nanda.java.codingbat;

public class Fix23 {
	
	public static void main(String[] args) {
		for (int num : fix23(new int[] {2,3,5})) {
			System.out.println(num);
		}
	}
	
	public static int[] fix23(int[] nums) {
		  
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == 2 && nums[i+1] == 3) {
				nums[i+1] = 0;
				i++;
			}
		}
		
		return nums;
	}


}
