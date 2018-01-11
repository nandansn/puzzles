package com.nanda.java.codingbat.array;

public class Has77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(has77(new int[] { 1, 7, 1, 1, 7, 7 }));

	}

	public static boolean has77(int[] nums) {

		boolean flag = false;

		for (int i = 0; i <= nums.length - 2; i++) {
			if (nums[i] == 7) {
				if (nums[i + 1] == 7) {
					flag = true;
					return flag;
				} else if((i+2) < nums.length && nums[i+2] == 7){
					flag = true;
					return flag;
				} else {
					flag = false;
					
				}
			}
		}

		return flag;

	}

}
