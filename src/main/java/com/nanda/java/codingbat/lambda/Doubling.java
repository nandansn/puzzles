package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doubling(Arrays.asList(new Integer[] {1,2,3})).stream().forEach(number -> System.out.println(number));

	}
	
	public static List<Integer> doubling(List<Integer> nums) {
		
		nums = nums.stream().map(number -> Math.multiplyExact(number, 2)).collect(Collectors.toList());
		
		return nums;
		  
	}


}
