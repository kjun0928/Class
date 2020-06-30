package HWPracice;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int number = input.nextInt();
		double number2 = number * 1.8 + 32;
		System.out.printf("You entered%n" + number2);

		input.close();

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner input = new Scanner(System.in);
	 * 
	 * System.out.println("Enter an number :"); int number = input.nextInt(); int
	 * sum = 0;
	 * 
	 * for (int start = 1; start <= number; ++start) {
	 * 
	 * sum += start;
	 * 
	 * }
	 * 
	 * System.out.printf("Answer is : %n" + sum); }
	 * 
	 */
}
