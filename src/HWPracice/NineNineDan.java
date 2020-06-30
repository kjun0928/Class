package HWPracice;

import java.util.Scanner;

public class NineNineDan {

	public static void main(String[] args) {

		int i = 0;

		int sum = 1;

		Scanner input = new Scanner(System.in);
		for (;;) {

			System.out.println("몇단?");
			int number = input.nextInt();
			if (number == 0) {
				input.close();
				break;
			}
			System.out.println("몇까지??");
			int number2 = input.nextInt();

			for (i = 1; i <= number2; i++) {

				sum = number * i;
				System.out.println("" + number + " X " + i + " = " + sum + "");

			}

		}
		
	}

}
