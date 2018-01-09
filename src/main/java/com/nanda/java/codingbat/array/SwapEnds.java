package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class SwapEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays.stream(swapEnds(new int[] { 1, 2, 3, 4 })).forEach(i -> System.out.println(i));
	}

	public static int[] swapEnds(int[] nums) {

		if (nums.length > 1) {

			nums[0] = nums[0] + nums[nums.length - 1];
			nums[nums.length - 1] = nums[0] - nums[nums.length - 1];
			nums[0] = nums[0] - nums[nums.length - 1];
		}

		return nums;
	}

}
