package com.nanda.java.codingbat.string;

public class SameEnds {

	public static void main(String[] args) {

		System.out.println(sameEnds("javaXYZjava"));
	}

	public static String sameEnds(String string) {

		StringBuilder sb = new StringBuilder();

		String sameEnds = "";

		int limit = string.length() / 2;

		for (int i = 0; i < limit; i++) {

			sb = new StringBuilder();

			String subString = string.substring(0, i + 1);

			if (subString.length() == string.length()) {
				sb.append("");
				break;
			}

			if (subString.equals(string.substring(string.length() - 1 - i))) {
				sb.append(subString);

				sameEnds = sb.toString();
			}

		}

		return sameEnds;
	}

}
