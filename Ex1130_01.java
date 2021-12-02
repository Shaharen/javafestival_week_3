package nov.thirty;

import java.util.Scanner;

public class Ex1130_01 {

	public static void main(String[] args) {
		// 두 개의 정수를 매개변수
		// 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드 isDivide
		// 나누어지면 true, 아니면 false를 반환
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();
		
		System.out.println("결과 확인 : " + isDivide(num1, num2));
	}
	public static boolean isDivide (int num1, int num2) {
		if ( num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
