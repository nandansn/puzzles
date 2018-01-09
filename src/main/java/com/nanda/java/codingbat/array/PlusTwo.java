package com.nanda.java.codingbat.array;

import java.util.Arrays;

public class PlusTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays.stream(plusTwo(new int[] { 1, 2 }, new int[] { 3, 4 })).forEach(i -> System.out.println(i));

	}

	public static int[] plusTwo(int[] a, int[] b) {

		int mergedLength = a.length + b.length;
		int[] newMergredArray = new int[mergedLength];

		int j = 0;
		int k = 0;

		for (int i = 0; i < newMergredArray.length; i++) {

			if (i < a.length) {
				newMergredArray[i] = a[j];
				j++;
			} else {
				j = 0;
				newMergredArray[i] = b[k];
				k++;
			}
			

		}

		return newMergredArray;

	}

}
