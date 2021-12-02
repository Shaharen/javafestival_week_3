package dec_01;

public class Ex1201_01 {

	public static void main(String[] args) {
		// 문자열을 입력받아 알파벳 순서대로 정렬하여 반환하는 메소드를 구현
		// 대소문자 구분

		reverseStr("ZAbcdVefEg");

	}

	public static void reverseStr(String a) {
		String str = a;
		char[] array = str.toCharArray();
//		for (int i = 0 ; i < array.length; i++) {
//			System.out.println(array[i] + " ");
//		}
//		array 가 잘 들어갔는지 확인

		// array끼리 아스키코드 확인 후 정렬
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					char temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
