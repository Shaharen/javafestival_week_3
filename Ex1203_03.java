package dec_03;

import java.util.Scanner;

public class Ex1203_03 {

	public static void main(String[] args) {
		// ��� ���ڸ� ���ϴ� getMiddle �޼ҵ� ����
		// Ȧ���϶� ��� ¦���϶� ����翷 ���
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� �Է� >> ");
		String input = sc.next();
		
		getMiddle(input);
	}

	public static void getMiddle(String a) {
		String str = a;
		char[] array = str.toCharArray();
		int middleNumber = 0;
		
		// ¦��
		if (array.length % 2 == 0) {
			middleNumber = array.length / 2;
			System.out.print(array[middleNumber - 1]);
			System.out.println(array[middleNumber]);
			
		}
		// Ȧ��
		if (array.length % 2 == 1) {
			middleNumber = array.length / 2;
			System.out.println(array[middleNumber]);
		}

	}
}
