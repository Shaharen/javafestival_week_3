package nov.thirty;

import java.util.Scanner;

public class Ex1130_01 {

	public static void main(String[] args) {
		// �� ���� ������ �Ű�����
		// ���� ������ ���� ������ �������������� �Ǻ��ϴ� �޼ҵ� isDivide
		// ���������� true, �ƴϸ� false�� ��ȯ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();
		
		System.out.println("��� Ȯ�� : " + isDivide(num1, num2));
	}
	public static boolean isDivide (int num1, int num2) {
		if ( num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
