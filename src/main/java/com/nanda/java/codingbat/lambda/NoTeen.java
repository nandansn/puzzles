package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		noTeen(Arrays.asList(new Integer[] {1,2,12,13,19,15})).forEach(i -> System.out.println(i));

	}

	
	public static List<Integer> noTeen(List<Integer> nums) {
		
		nums = nums.stream().filter(i -> (i < 13 || i > 19)).collect(Collectors.toList());
		
		return nums;
		  
	}

}
