package dec_01;

public class Ex1201_01 {

	public static void main(String[] args) {
		// ���ڿ��� �Է¹޾� ���ĺ� ������� �����Ͽ� ��ȯ�ϴ� �޼ҵ带 ����
		// ��ҹ��� ����

		reverseStr("ZAbcdVefEg");

	}

	public static void reverseStr(String a) {
		String str = a;
		char[] array = str.toCharArray();
//		for (int i = 0 ; i < array.length; i++) {
//			System.out.println(array[i] + " ");
//		}
//		array �� �� ������ Ȯ��

		// array���� �ƽ�Ű�ڵ� Ȯ�� �� ����
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
