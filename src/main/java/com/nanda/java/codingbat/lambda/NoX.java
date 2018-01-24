package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noX(Arrays.asList(new String[] {"ax", "bb", "cx"})).forEach(string -> System.out.println(string));
	}
	
	
	public static List<String> noX(List<String> strings) {
		
		strings = strings.stream().map(string -> string.replaceAll("x", "")).collect(Collectors.toList());
		
		return strings;
		  
	}


}
