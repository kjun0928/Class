package HWPracice;
import java.util.Scanner;

public class CashBank {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("당신의 계좌는 815425-04-545256 (예금주 : 고길동)");
			int sum = 0;

			
			for(;;) {
				
				System.out.println("현재 잔액(원) :" + sum);
				System.out.println("얼마를 입금하시겠습니까? : ");
				int number = input.nextInt();
				sum += number;
				
				if(number==0) {
					break;
				}
				
				System.out.printf(""+sum+"원 입금합니다.%n");
				
				
			
			}

			System.out.println("종료합니다");
			System.out.println("잔액 :"+sum+" ");
		}
	
	}
}

