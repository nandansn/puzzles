package com.nanda.java.codingbat.array;

public class WithoutTen {
	
	public static void main(String[] args) {
		for(int i: withoutTen(new int[] {1, 10, 10, 2})) {
			System.out.print(i);
		}
	}
	
	public static int[] withoutTen(int[] nums) {
		
		
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] == 10) {
				
				int j = i + 1;
				for (; j < nums.length; j++) {
					if(nums[j] != 10) {
						nums[i] = nums[j];
						nums[j] = 10;
					
						break;
					}
				}
			}
			
		}
		
		for (int i = nums.length - 1; i>=0; i--) {
			
			if(nums[i] == 10) {
				nums[i] =0;
			} else {
				break;
			}
		}
		
		return nums;
		  
	}


}
