package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		noYY(Arrays.asList(new String[] {"yyx", "y", "zzz"})).forEach(s -> System.out.println(s));

	}
	
	public static List<String> noYY(List<String> strings) {
		
		strings = strings.stream().map(s -> s.concat("y")).filter(s -> !s.contains("yy")).collect(Collectors.toList());
		
		return strings;
		  
	}


}
