package dec_03;

import java.util.Scanner;

public class Ex1203_03 {

	public static void main(String[] args) {
		// 가운데 글자를 구하는 getMiddle 메소드 구현
		// 홀수일때 가운데 짝수일때 가운데양옆 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 >> ");
		String input = sc.next();
		
		getMiddle(input);
	}

	public static void getMiddle(String a) {
		String str = a;
		char[] array = str.toCharArray();
		int middleNumber = 0;
		
		// 짝수
		if (array.length % 2 == 0) {
			middleNumber = array.length / 2;
			System.out.print(array[middleNumber - 1]);
			System.out.println(array[middleNumber]);
			
		}
		// 홀수
		if (array.length % 2 == 1) {
			middleNumber = array.length / 2;
			System.out.println(array[middleNumber]);
		}

	}
}
