package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class Unlucky1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(unlucky1(new int[] { 1, 1, 1, 3, 1,1 }));

	}

	public static boolean unlucky1(int[] nums) {

		// Arrays.sort(nums);

		boolean flag = false;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 1) {

				if (i+1 < nums.length && nums[i + 1] == 3) {
					if((nums[0] ==0 && nums[1] == 1) || (nums[nums.length-1] == 1 && nums[nums.length-2] == 1)) {
						flag = true;
					}

				}else {
					flag = false;
				}
			} 

		}

		return flag;

	}

}
