package com.nanda.java.codingbat.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Post4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays.stream(post4(new int[] {4, 4, 1, 2, 3})).forEach(i -> System.out.println(i));

	}
	
	public static int[] post4(int[] nums) {
		
		
		
		int i = nums.length-1;
		
		for (; i >= 0; i--) {
			
			if(nums[i] == 4) {
				break;
			} 
			
			
			
		}
		
		int[] subArray = new int[nums.length - 1 - i];
		
		for (int j = 0; j < subArray.length; j++) {
			
			
			subArray[j] = nums[++i];
		}
		
		
		
		return subArray;
		  
	}


}
