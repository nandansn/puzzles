package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		noZ(Arrays.asList(new String[] {"aaa", "bbb", "aza"})).forEach(s -> System.out.println(s));

	}
	
	public static List<String> noZ(List<String> strings) {
		
		strings = strings.stream().filter(s -> s.indexOf('z') == -1 ).collect(Collectors.toList());
		
		return strings;
		  
	}


}
