package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Math1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		math1(Arrays.asList(new Integer[] {1,2,3})).forEach(num -> System.out.println(num));
	}
	
	
	public static List<Integer> math1(List<Integer> nums) {
		
		nums = nums.stream().map(num -> (num + 1) * 10).collect(Collectors.toList());
		
		return nums;
		  
	}


}
