package com.nanda.java.codingbat.array;

public class Has22 {
	
	public static void main(String[] args) {
		System.out.println(has22(new int[] {1,2,1,3,5}));
	}

	public static boolean has22(int[] nums) {

		boolean has22 = false;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 2 && nums[i + 1] == 2) {
				has22 = true;
				break;
			}

		}

		return has22;

	}

}
