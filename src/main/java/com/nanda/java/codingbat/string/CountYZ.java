package com.nanda.java.codingbat.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountYZ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;

		while (scan.hasNextLine()) {

			String[] str = scan.nextLine().split("[^A-Za-z]");

			for (String string : str) {
				if (!string.isEmpty()) {
					
					if (string.charAt(string.length() - 1) == 'z' || string.charAt(string.length() - 1) == 'y') {
						count++;
					}

				} 
			}

			System.out.println(count);
		}

		scan.close();
	}

}
