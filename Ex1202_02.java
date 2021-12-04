package dec_02;

import java.util.Scanner;

public class Ex1202_02 {

	public static void main(String[] args) {
		// 그림과 같이 대시(_)문자로 구성된 형태의 숫자를
		// 주어진 숫자와 같이 출력하고 싶을때 사용되게 되는
		// 대시의 개수를 출력하는 프로그램 작성
		// ex) 0 = _ 6개
		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num1 = sc.nextInt();

		System.out.print("대시 ('-')의 총 합 >> ");
		System.out.println(dash(num1));

	}
 
	public static int dash(int num) {

		// 입력 받은 수 자리수 구하기
		int ten = 10; // num을 10으로 계속 나눠줄 변수
		int j = 0;// 자리수 변수
		int num2 = num; // 받은 num 보존
		for (int i = 1; i < 100; i++) {
			if (num < 10) {
				j = i;
				break;
			}
			num = num / ten;
		}
		System.out.println(j);
		// 알아낸 자리수의 배열로 넣어서 각 index에 존재하는 숫자만큼
		// 대시 합 출력 ( 0,6,9 - 6개 / 1 - 2개 / 2,3,5 - 5개 / 4,7- 4개 / 8 - 7개
		int[] a = new int[j];
		int dashSum = 0;
		// 배열 생성
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
