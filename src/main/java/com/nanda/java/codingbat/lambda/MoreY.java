package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		moreY(Arrays.asList(new String[] {"yay", "yby", "ycy"})).forEach(string -> System.out.println(string));

	}
	
	
	public static List<String> moreY(List<String> strings) {
		
		strings = strings.stream().map(string -> "y".concat(string).concat("y")).collect(Collectors.toList());
		
		return strings;
		  
	}


}
