package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Two2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays.asList(new int[] {}).stream().forEach(i -> System.out.println(i));

	}

	public List<Integer> two2(List<Integer> nums) {

		nums = nums.stream().map(number -> (number * 2)).filter(number -> (number % 10) != 2)
				.collect(Collectors.toList());

		return nums;

	}

}
