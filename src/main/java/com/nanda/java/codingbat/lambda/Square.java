package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		square(Arrays.asList(new Integer[] {1, 2, 3})).forEach(number -> System.out.println(number));

	}
	
	public static List<Integer> square(List<Integer> nums) {
		
		nums = nums.stream().map(number -> number * number).collect(Collectors.toList());
		
		return nums;
		  
	}


}
