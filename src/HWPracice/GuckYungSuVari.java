package HWPracice;

import java.util.Scanner;

public class GuckYungSuVari {
	public static void main(String[] arge) {

		try (Scanner input = new Scanner(System.in)) {
			/*
			 * int[] A = { 90, 80, 80 }; int sumA = A[0] + A[1] + A[2]; int variA = sumA /
			 * 3; System.out.println("ID : A  점수합계 : " + sumA + " 점수 평균 : " + variA + "");
			 * int[] B = { 85, 85, 95 }; int sumB = B[0] + B[1] + B[2]; int variB = sumB /
			 * 3; System.out.println("ID : B  점수합계 : " + sumB + " 점수 평균 : " + variB + "");
			 * int[] C = { 95, 70, 75 }; int sumC = C[0] + C[1] + C[2]; int variC = sumC /
			 * 3; System.out.println("ID : C  점수합계 : " + sumC + " 점수 평균 : " + variC + "");
			 * int[] D = { 80, 80, 90 }; int sumD = D[0] + D[1] + D[2]; int variD = sumD /
			 * 3; System.out.println("ID : D  점수합계 : " + sumD + " 점수 평균 : " + variD + "");
			 * int[] E = { 90, 75, 80 }; int sumE = E[0] + E[1] + E[2]; int variE = sumE /
			 * 3; System.out.println("ID : E  점수합계 : " + sumE + " 점수 평균 : " + variE + "");
			 */
			int[][] Score = { { 90, 80, 80 }, { 85, 85, 95 }, { 85, 85, 95 }, { 80, 80, 90 }, { 90, 75, 80 } };
			String[] Stu = { "A", "B", "C", "D", "E" };

			for (int i = 0; i <= 4; i++) {
				int sum = 0;
				int vari = 0;
				for (int j = 0; j <= 2; j++) {
					sum += Score[i][j];
				}
				vari = sum / 3;
				System.out.println("ID : " + Stu[i] + "  점수합계 : " + sum + " 점수 평균 : " + vari + "");

			}
		}
	}
}