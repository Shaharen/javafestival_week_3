package dec_04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1204_01 {

	public static void main(String[] args) {
		// �ϻ��� ��
		// X�� �ϻ��� ���̸� X�� X�� �ڸ����� ���� ����� ���´�
		// isHarshad �޼ҵ�� n�� �Է¹޾�
		// TF �Ǻ� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("�ϻ��� �Ǻ��� �� >>");
		int num = sc.nextInt();

		System.out.println(isHarshad(num));
	}

	public static boolean isHarshad(int num) {

		int ten = 10;
		int size = 0;
		// �Է¹��� �� �ڸ��� ���ϱ�
		for (int i = 1; i <= num; i++) {
			if (num % ten == num) {
				size = i;
//			System.out.println(i);
				break;
			}
			ten = ten * 10;
		}
		int sum = 0;
		int original = num; // ���� ��
		ten = 10;
		// ũ�⸸ŭ �迭�� ���� �� �ڸ��� ����
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = num % ten;
			num = num / ten;
			sum += array[i];
		}
//		System.out.println(Arrays.toString(array));
//		System.out.println(sum);
		// ���Ͽ� ��
		if (original % sum == 0) {
			return true;
		} else
			return false;

	}
}
