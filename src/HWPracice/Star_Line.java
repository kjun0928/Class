package HWPracice;

import java.util.Scanner;

public class Star_Line {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int k = 0;
			int K = 0;
			int N = 0;

			for (;;) {

				System.out.println("Enter Line number : ");
				int number = input.nextInt();
				if (number == 0) {
					break;
				}

				k = number - 1;
				K = k;
				N = number;

				for (int i = 1; i <= number; i++) {

					System.out.println();
					k = K;

					for (; k < number; k++) {

						System.out.printf("*");

					}
					number++;
					if (number == N*2 ) {
						break;
					}

				}

			}
		}

	}

}