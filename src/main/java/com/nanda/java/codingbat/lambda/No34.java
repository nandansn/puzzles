package com.nanda.java.codingbat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		no34(Arrays.asList(new String[] {"a", "bb", "ccc", "55555"})).forEach(s -> System.out.println(s));

	}
	
	public static List<String> no34(List<String> strings) {
		
		strings = strings.stream().filter(s -> s.length() !=3 && s.length() !=4 ).collect(Collectors.toList());
		
		return strings;
		  
	}


}
