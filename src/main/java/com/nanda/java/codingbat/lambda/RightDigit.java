package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rightDigit(Arrays.asList(new Integer[] {1, 22, 93})).forEach(num -> System.out.println(num));

	}
	
	
	public static List<Integer> rightDigit(List<Integer> nums) {
		
		nums = nums.stream().map(num -> num % 10).collect(Collectors.toList());
		
		return nums;
		  
	}


}
