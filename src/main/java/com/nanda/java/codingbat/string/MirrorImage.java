package com.nanda.java.codingbat.string;

public class MirrorImage {
	
	public static void main(String[] args) {
		
		System.out.println(mirrorEnds("aba"));
	}
	
	
	public static String mirrorEnds(String string) {
		
		String mirrorImage ="";
		
		for (int i = 0; i < string.length(); i++) {
			
			String substringFirst = string.substring(0, i+1);
			
			String substringLast = string.substring(string.length() -1 -i, string.length());
			
			StringBuilder sb = new StringBuilder();
			
			for (int j = substringLast.length()-1; j >= 0; j--) {
				sb.append(substringLast.charAt(j));
			}
			
			if(sb.toString().equals(substringFirst)) {
				mirrorImage = substringFirst;
			}
			
		}
		
		return mirrorImage;
		  
	}

}
