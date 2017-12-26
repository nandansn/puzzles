package com.nanda.java.codingbat.string;

public class AP {

	public static void main(String[] args) {

		int[] a = { 1, 1, 2, 4, 3, 7 };
		
		scoresIncreasing(a);

	}

	public static boolean scoresIncreasing(int[] scores) {

		boolean scoresIncreasing = false;

		for (int i = 0; i < scores.length; i++) {
			if ((i + 1) < scores.length) {
				if (scores[i] <= scores[i + 1]) {

					scoresIncreasing = true;

				} else {
					scoresIncreasing = false;
				}

			} else {
				return scoresIncreasing;
			}
		}

		return scoresIncreasing;
	}

}
