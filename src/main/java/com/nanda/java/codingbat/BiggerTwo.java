package com.nanda.java.codingbat;

public class BiggerTwo {
	
	public static void main(String[] args) {
		for (int num : biggerTwo(new int[] {1, 1}, new int[] {1, 2})) {
			System.out.println(num);
		}
	}
	
	public static int[] biggerTwo(int[] a, int[] b) {
		int aSum = 0, bSum =0;  
		for (int i = 0; i < b.length; i++) {
			aSum = aSum + a[i];
			bSum = bSum + b[i];
			
			
			
		}
		
		if(aSum >= bSum) {
			return a;
		}else {
			return b;
		}
	}


}
