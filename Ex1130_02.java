package nov.thirty;

import java.util.Scanner;

public class Ex1130_02 {

	public static void main(String[] args) {
		// num1, num2 op(+ - * /)�� �Ű������� �޾�
		// ������ ������� ��ȯ���ִ� cal �޼ҵ� �ۼ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();
		System.out.print("���� �Է� >> ");
		String op = sc.next();
		
		System.out.println("����� : " + cal(num1,num2,op));

	}
	public static int cal (int num1, int num2, String a) {
		int result = 0;
		if (a.equals("+")) {
			result = num1 + num2;
			
		}if (a.equals("-")) {
			result = num1 - num2;
			
		}if (a.equals("*")) {
			result = num1 * num2;
			
		}if (a.equals("/")) {
			result = num1 / num2;
			
		}return result;
	
	}
}
