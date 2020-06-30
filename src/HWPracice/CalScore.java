package HWPracice;

import java.util.Scanner;

public class CalScore {
	public static void main(String[] arge) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("점수 입력 : ");
			int score = input.nextInt();
			System.out.println("학점 : ");
			if (score >= 90) {
				System.out.println("A");
			}
			if (90 > score && score > 79) {
				System.out.println("B");
			}
			if (80 > score && score > 69) {
				System.out.println("C");
			}
			if (70 > score && score > 59) {
				System.out.println("D");
			}
			if (60 > score) {
				System.out.println("F");
			}
		}

	}

}
