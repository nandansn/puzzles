package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		noYY(Arrays.asList(new String[] {"a", "b", "cy"})).forEach(s -> System.out.println(s));

	}
	
	public static List<String> noYY(List<String> strings) {
		
		strings = strings.stream().filter(s -> s.charAt(s.length() -1) !='y').map(s -> s.concat("y")).collect(Collectors.toList());
		
		return strings;
		  
	}


}
