package com.nanda.java.codingbat.string;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProblems {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {

			System.out.println(equalIsNot(scan.nextLine()));
		}
	}

	public static boolean equalIsNot(String str) {

		int isCount = 0;
		int notCount = 0;

		Pattern p = Pattern.compile("(is|IS)");

		Matcher m = p.matcher(str);

		while (m.find()) {
			isCount++;
		}

		p = Pattern.compile("(not|NOT)");
		m.reset();

		m = p.matcher(str);

		while (m.find()) {
			notCount++;
		}
		System.out.println(notCount);

		return isCount == notCount ? true : false;
	}

}
