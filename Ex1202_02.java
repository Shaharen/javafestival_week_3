package dec_02;

import java.util.Scanner;

public class Ex1202_02 {

	public static void main(String[] args) {
		// �׸��� ���� ���(_)���ڷ� ������ ������ ���ڸ�
		// �־��� ���ڿ� ���� ����ϰ� ������ ���ǰ� �Ǵ�
		// ����� ������ ����ϴ� ���α׷� �ۼ�
		// ex) 0 = _ 6��
		Scanner sc = new Scanner(System.in);

		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int num1 = sc.nextInt();

		System.out.print("��� ('-')�� �� �� >> ");
		System.out.println(dash(num1));

	}
 
	public static int dash(int num) {

		// �Է� ���� �� �ڸ��� ���ϱ�
		int ten = 10; // num�� 10���� ��� ������ ����
		int j = 0;// �ڸ��� ����
		int num2 = num; // ���� num ����
		for (int i = 1; i < 100; i++) {
			if (num < 10) {
				j = i;
				break;
			}
			num = num / ten;
		}
		System.out.println(j);
		// �˾Ƴ� �ڸ����� �迭�� �־ �� index�� �����ϴ� ���ڸ�ŭ
		// ��� �� ��� ( 0,6,9 - 6�� / 1 - 2�� / 2,3,5 - 5�� / 4,7- 4�� / 8 - 7��
		int[] a = new int[j];
		int dashSum = 0;
		// �迭 ����
		for (int i = 0; i < a.length; i++) {
			a[i] = num2 % 10;
			num2 = num2 / 10;
		}
		// System.out.println(a[0]);
		// System.out.println(a[1]);
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0 || a[i] == 6 || a[i] == 9) {
				dashSum = dashSum + 6;
			} else if (a[i] == 1) {
				dashSum = dashSum + 2;
			} else if (a[i] == 2 || a[i] == 3 || a[i] == 5) {
				dashSum = dashSum + 5;
			} else if (a[i] == 4) {
				dashSum = dashSum + 4;
			} else if (a[i] == 7) {
				dashSum = dashSum + 3;
			} else if (a[i] == 8) {
				dashSum = dashSum + 7;
			}
		}

		return dashSum;
	}
}
