package nov.thirty;

import java.util.Scanner;

public class Ex1130_02 {

	public static void main(String[] args) {
		// num1, num2 op(+ - * /)를 매개변수로 받아
		// 연산한 결과값을 반환해주는 cal 메소드 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();
		System.out.print("연산 입력 >> ");
		String op = sc.next();
		
		System.out.println("결과는 : " + cal(num1,num2,op));

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
