package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addStar(Arrays.asList(new String[] {"a", "bb", "ccc"})).forEach(string -> System.out.println(string));

	}
	
	public static List<String> addStar(List<String> strings) {
		  
		strings = strings.stream().map(string -> string.concat("*")).collect(Collectors.toList());
		
		return strings;
	}

}
