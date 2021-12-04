package dec_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1204_02 {

	public static void main(String[] args) {
		// 멀리뛰기 ( 피보나치 )
		// 한번에 1칸 또는 2칸
		// 멀리뛰기에 사용될 칸의 수에 따라
		// 끝에 도달하는 방법이 몇가지인지 출력하는 메소드
		Scanner sc = new Scanner(System.in);

		System.out.println("이동할 칸의 수 >> ");
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
