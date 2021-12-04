package dec_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1203_01 {

	public static void main(String[] args) {
		// 정수형 변수 input 선언하고
		// 피보나치 수열의 input 번째 항까지 출력하시오.
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt(); // input 개 출력

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

	public static int fibo(int num) {
		int hang1 = 0;
		int hang2 = 1;
		int hang = 1;

		for (int i = 0; i < num - 1; i++) {
			hang = hang1 + hang2;
			hang1 = hang2;
			hang2 = hang;
		}
		return hang;

	}
}
