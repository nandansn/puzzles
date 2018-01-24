package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lower(Arrays.asList(new String[] {"Hello", "Hi"})).forEach(string -> System.out.println(string));

	}
	
	public static List<String> lower(List<String> strings) {
		
		strings = strings.stream().map(string -> string.toLowerCase()).collect(Collectors.toList());
		
		return strings;
		  
	}

	

}
