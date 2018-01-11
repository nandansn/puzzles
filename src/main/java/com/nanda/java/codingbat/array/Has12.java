package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class Has12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(has12(new int[] {  1, 4, 5, 4, 1,2 }));

	}

	public static boolean has12(int[] nums) {

		boolean has1 = false;
		boolean has2 = false;

		int iPos = nums.length;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 1) {
				iPos = i;
				has1 = true;
			}

			if (nums[i] == 2) {
				if (i > iPos) {
					has2 = true;
				}
			}

		}

		if (has1 && has2) {
			return true;
		} else {
			return false;
		}

	}

}
