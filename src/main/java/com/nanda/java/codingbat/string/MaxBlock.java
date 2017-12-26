package com.nanda.java.codingbat.string;

public class MaxBlock {
	
	public static void main(String[] args) {
		
		System.out.println(maxBlock("XX2222BBBbbXX2222"));
	}
	
	
	public static int maxBlock(String str) {
		
		int count =0;
		StringBuilder maxBlock  = null;
		
		for (int i = 0; i < str.length(); i++) {
			maxBlock = new StringBuilder();
			for (int j = i; j < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					maxBlock.append(str.charAt(j));
					if(maxBlock.length() > count)
						count = maxBlock.length();
				}else {
					break;
				}
			}
			
		}
		
		
		return count;
		  
	}

}
