package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		square56(Arrays.asList(new Integer[] {3, 1, 4})).forEach(number -> System.out.println(number));

	}
	
	public static List<Integer> square56(List<Integer> nums) {
		
		
		
		nums = nums.stream().map(number -> Math.multiplyExact(number, number) + 10).filter(number -> !(number % 10 ==5 || number % 10 ==6)).collect(Collectors.toList());
		
		return nums;
			
		  
	}


}
