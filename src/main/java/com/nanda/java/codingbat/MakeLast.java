package com.nanda.java.codingbat;

public class MakeLast {
	
	
	
	public static void main(String[] args) {
		
		
		for (int num : makeLast(new int[] {4,5,6})) {
			
			System.out.println(num);
		}
	}
	
	
	
	
	public static int[] makeLast(int[] nums) {
		int[] newArray = new int[nums.length*2];
		
		for (int i = 0; i < newArray.length-1; i++) {
			
			newArray[i] =0;
		}
		
		newArray[newArray.length-1] = nums[nums.length-1];
		
		return newArray;
	}


}
