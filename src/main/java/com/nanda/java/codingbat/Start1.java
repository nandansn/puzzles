package com.nanda.java.codingbat;

public class Start1 {
	
	public static void main(String[] args) {
		
		System.out.println(start1(new int[] {1,2,3}, new int[] {1}));
	}
	
	public static int start1(int[] a, int[] b) {
		
		int count =0 ;
		
		
			if(a.length >0 && a[0] ==1 ) {
				count++;
			}
			if(b.length >0 && b[0] == 1) {
				count++;
			}
			
		
		
		return count;
	}
		  
		


}
