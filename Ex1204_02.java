package dec_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1204_02 {

	public static void main(String[] args) {
		// �ָ��ٱ� ( �Ǻ���ġ )
		// �ѹ��� 1ĭ �Ǵ� 2ĭ
		// �ָ��ٱ⿡ ���� ĭ�� ���� ����
		// ���� �����ϴ� ����� ������� ����ϴ� �޼ҵ�
		Scanner sc = new Scanner(System.in);

		System.out.println("�̵��� ĭ�� �� >> ");
		int num = sc.nextInt();

		jumpCase(num);
	}

	public static int jumpCase(int num) {
		ArrayList<Integer> jump = new ArrayList<Integer>();
		jump.add(1);
		jump.add(2);

		for (int i = 0; i < num; i++) {
			jump.add(jump.get(i) + jump.get(i + 1));
		}
		System.out.println(jump.get(num - 1));

		return -1;
	}

}
