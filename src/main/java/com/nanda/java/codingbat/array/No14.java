package com.nanda.java.codingbat.array;

public class No14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(no14(new int[] {1,2,3}));
	}
	
	public static boolean no14(int[] nums) {
		  
		boolean isNo14 = true;
		int is1Or4 = -1;
		
		for (int i : nums) {
			
			if((is1Or4 != i && is1Or4 !=-1 ) && (i == 1 || i == 4) ) {
				isNo14 = false;
				break;
			}
			
			if(i == 1 || i == 4) {
				is1Or4 = i;
			}
			
		}
		
		return isNo14;
	}


}
