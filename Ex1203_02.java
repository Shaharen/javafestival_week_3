package dec_03;

import java.util.Arrays;

public class Ex1203_02 {

	public static void main(String[] args) {
		// 합병 메소드
		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		mergeArray(A, B);
		
	}

	public static void mergeArray(int[] a, int[] b) {
		int merge[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			merge[i] = a[i];
		}
		for (int i = a.length; i < merge.length; i++) {
			merge[i] = b[i - a.length];
		}
//		for (int i = 0; i < merge.length; i++) {
//			System.out.println(merge[i]);
//		} => merge에 a,b 입력 완료 확인

		// 정렬
		for (int i = 0; i < merge.length - 1; i++) {
			for (int j = 0; j < merge.length - i - 1; j++) {
				if (merge[j] > merge[j + 1]) {
					int temp = merge[j + 1];
					merge[j + 1] = merge[j];
					merge[j] = temp;
				}
			}
		}
		// 출력
		System.out.print("Merge : ");
		System.out.println(Arrays.toString(merge));
		
	}
}
