package dec_02;

import java.util.Scanner;

public class Ex1202_01 {

	public static void main(String[] args) {
		// startValue ���� endValue ������ ������ �������� ����ϴ�
		// getPerfectNumber()�޼ҵ带 ����
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� >> ");
		int startValue = sc.nextInt();
		System.out.print("�� ���� >> ");
		int endValue = sc.nextInt();

		getPerfectNumber(startValue, endValue);

	}

	public static int getPerfectNumber(int num1, int num2) {
		int sum = 0;
		System.out.println(num1 + " ~ " + num2 + " ������ ������ : ");
		for (int i = num1; i <= num2; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {

				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(sum + " ");
			}
		}
		return 0;
	}
}
