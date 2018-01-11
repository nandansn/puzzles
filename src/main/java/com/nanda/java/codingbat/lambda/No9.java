package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		no9(Arrays.asList(new Integer[] {1,2,3,4,19})).forEach(i -> System.out.println(i));

	}
	
	
	public static List<Integer> no9(List<Integer> nums) {
		
		nums = nums.stream().filter(i -> i % 10 != 9).collect(Collectors.toList());
		return nums;
	}


}
