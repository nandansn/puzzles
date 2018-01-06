package com.nanda.others;

public class JarProblem {

	static int threeLitresJar = 0;
	static int fiveLitresJar = 0;
	static int eightLitresJar = 8;

	public static void main(String[] args) {

		makeTwoFourLitres();

	}

	public static void makeTwoFourLitres() {

		while (fiveLitresJar != 4 && threeLitresJar != 4) {

			if (threeLitresJar == 0) {

				threeLitresJar = pourFromFiveLitres(threeLitresJar, fiveLitresJar);

			}

			if (fiveLitresJar == 0) {

				fiveLitresJar = pourFromEightLitres(fiveLitresJar, eightLitresJar);

			} else {

				fiveLitresJar = pourFromEightLitres(fiveLitresJar, eightLitresJar);
			}

			if (fiveLitresJar == 4 && eightLitresJar == 4) {
				break;
			}

			threeLitresJar = pourFromFiveLitres(threeLitresJar, fiveLitresJar);

			if (fiveLitresJar == 4 && eightLitresJar == 4) {
				break;
			}

			eightLitresJar = pourFromThreeLitres(threeLitresJar, eightLitresJar);

		}

	}

	public static int pourFromEightLitres(int currentQtyInFiveLitreJar, int currentQtyInEightLitreJar) {

		int currentFiveLitre = 0;

		currentFiveLitre = currentQtyInFiveLitreJar + currentQtyInEightLitreJar;

		if (currentFiveLitre > 5) {

			eightLitresJar = currentFiveLitre - 5;
			currentFiveLitre = 5;
		} else {
			eightLitresJar = currentQtyInEightLitreJar - currentFiveLitre;
		}

		System.out.println(eightLitresJar + "-" + currentFiveLitre + "-" + threeLitresJar);

		return currentFiveLitre;

	}

	public static int pourFromFiveLitres(int currentQtyInThreeLitreJar, int currentQtyInFiveLitreJar) {

		int currentThreeLitre = 0;

		currentThreeLitre = currentQtyInThreeLitreJar + currentQtyInFiveLitreJar;

		if (currentThreeLitre > 3) {
			fiveLitresJar = currentThreeLitre - 3;
			currentThreeLitre = 3;
		} else {
			fiveLitresJar = currentQtyInFiveLitreJar - currentThreeLitre;
		}

		System.out.println(eightLitresJar + "-" + fiveLitresJar + "-" + currentThreeLitre);

		return currentThreeLitre;
	}

	public static int pourFromThreeLitres(int currentQtyInEightLitreJar, int currentQtyInThreeLitreJar) {

		int currentEightLitre = 0;

		currentEightLitre = currentQtyInEightLitreJar + currentQtyInThreeLitreJar;

		threeLitresJar = 0;

		System.out.println(currentEightLitre + "-" + fiveLitresJar + "-" + threeLitresJar);

		return currentEightLitre;
	}

}
