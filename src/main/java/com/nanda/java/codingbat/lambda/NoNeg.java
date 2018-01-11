package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NoNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		noNeg(Arrays.asList(new Integer[] {-1,2,3,-1})).forEach(i -> System.out.println(i));
		

	}
	
	public static List<Integer> noNeg(List<Integer> nums) {
				List<Integer> noNeg = nums.stream().filter(i -> i >= 0).collect(Collectors.toList());
		
		return noNeg;
		  
	}


}
