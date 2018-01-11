package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		noLong(Arrays.asList(new String[] {"this", "not", "too", "long"})).forEach(s -> System.out.println(s));

	}
	
	public static List<String> noLong(List<String> strings) {
		
		strings = strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
		
		return strings;
		  
	}


}
