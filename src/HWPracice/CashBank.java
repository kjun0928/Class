package HWPracice;
import java.util.Scanner;

public class CashBank {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("����� ���´� 815425-04-545256 (������ : ��浿)");
			int sum = 0;

			
			for(;;) {
				
				System.out.println("���� �ܾ�(��) :" + sum);
				System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�? : ");
				int number = input.nextInt();
				sum += number;
				
				if(number==0) {
					break;
				}
				
				System.out.printf(""+sum+"�� �Ա��մϴ�.%n");
				
				
			
			}

			System.out.println("�����մϴ�");
			System.out.println("�ܾ� :"+sum+" ");
		}
	
	}
}

