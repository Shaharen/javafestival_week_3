package dec_04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1204_01 {

	public static void main(String[] args) {
		// 하샤드 수
		// X가 하샤드 수이면 X는 X의 자리수의 합을 약수로 갖는다
		// isHarshad 메소드로 n을 입력받아
		// TF 판별 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("하샤드 판별할 수 >>");
		int num = sc.nextInt();

		System.out.println(isHarshad(num));
	}

	public static boolean isHarshad(int num) {

		int ten = 10;
		int size = 0;
		// 입력받은 수 자리수 구하기
		for (int i = 1; i <= num; i++) {
			if (num % ten == num) {
				size = i;
//			System.out.println(i);
				break;
			}
			ten = ten * 10;
		}
		int sum = 0;
		int original = num; // 원래 수
		ten = 10;
		// 크기만큼 배열에 만들어서 각 자리수 삽입
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = num % ten;
			num = num / ten;
			sum += array[i];
		}
//		System.out.println(Arrays.toString(array));
//		System.out.println(sum);
		// 합하여 비교
		if (original % sum == 0) {
			return true;
		} else
			return false;

	}
}
