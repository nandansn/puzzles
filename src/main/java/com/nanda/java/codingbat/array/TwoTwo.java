package com.nanda.java.codingbat.array;

public class TwoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(twoTwo(new int[] {2, 1, 2, 3}));

	}
	
	public static boolean twoTwo(int[] nums) {
		
		boolean flag = true;
		
		
		
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i] == 2) {
				if(nums[i - 1] == 2) {
					flag = true;
				}else {
					flag = false;
				}
			}
			
		}
		
		if(nums.length == 1 && nums[0] == 2) {
			
			return false;
		}
		
		return flag;
		  
	}


}
