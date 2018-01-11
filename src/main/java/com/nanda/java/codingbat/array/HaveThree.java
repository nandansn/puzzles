package com.nanda.java.codingbat.array;

public class HaveThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(haveThree(new int[] {3, 1, 3, 1, 3}));

	}
	
	
	public static boolean haveThree(int[] nums) {
		
		//boolean flag = true;
		
		int countOccurenceOfThree = 0;
		
		for (int i = 0; i < nums.length-1; i++) {
			
			if(nums[i] == 3 && nums[i+1] !=3) {
				++countOccurenceOfThree;
			}
			
			if(nums[i] != 3 && nums[i+1] ==3) {
				++countOccurenceOfThree;
			}
			
		}
		
		if(countOccurenceOfThree != 3) {
			return false;
		}else {
			return true;
		}
		
		  
	}


}
