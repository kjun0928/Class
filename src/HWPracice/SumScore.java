package HWPracice;

import java.util.Scanner;

public class SumScore {
	private static int sum;
	private static int vari;

	public static void main(String[] arge) {
		try (Scanner input = new Scanner(System.in)) {
			sum = 0;
			vari = 0;

			System.out.println("�����Է�(1) : ");
			int score1 = input.nextInt();
			System.out.println("�����Է�(2) : ");
			int score2 = input.nextInt();
			System.out.println("�����Է�(3) : ");
			int score3 = input.nextInt();
			System.out.println("�����Է�(4) : ");
			int score4 = input.nextInt();
			System.out.println("�����Է�(5): ");
			int score5 = input.nextInt();
			System.out.println("�����Է�(6) : ");
			int score6 = input.nextInt();
			System.out.println("�����Է�(7) : ");
			int score7 = input.nextInt();
			System.out.println("�����Է�(8) : ");
			int score8 = input.nextInt();
			System.out.println("�����Է�(9) : ");
			int score9 = input.nextInt();
			System.out.println("�����Է�(10) : ");
			int score10 = input.nextInt();
			sum = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
			vari = sum / 10;
			System.out.println("�հ� : " + sum);
			System.out.println("���� ��� : " + vari);
		}

	}
}