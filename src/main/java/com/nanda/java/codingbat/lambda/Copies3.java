package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		copies3(Arrays.asList(new String[] {"a", "bb", "ccc"})).forEach(string -> System.out.println(string));

	}
	
	
	public static List<String> copies3(List<String> strings) {
		
		strings = strings.stream().map(string -> string.concat(string).concat(string)).collect(Collectors.toList());
		
		return strings;
		  
	}

}
