package dec_02;

public class Ex1202_03 {

	public static void main(String[] args) {
		// ���������� ���ڿ��� ����Ǿ� ������
		// �� ���� �� �л� ���� ���
		// ��Ʈ�� �޼ҵ� �� ���ø� �޼ҵ� ���

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		split(score);
	}

	public static String split(String input) {

		String[] splitArray = input.split(",");
		int[] score = new int[5];
		score[0] = 0;

		for (int i = 0; i < splitArray.length; i++) {
			// System.out.println(splitArray[i]);
			if (splitArray[i].equals("A")) {
				score[0]++;
			} else if (splitArray[i].equals("B")) {
				score[1]++;
			} else if (splitArray[i].equals("C")) {
				score[2]++;
			} else if (splitArray[i].equals("D")) {
				score[3]++;
			} else if (splitArray[i].equals("F")) {
				score[4]++;
			}
		}
		System.out.println("A : " + score[0] + "��");
		System.out.println("B : " + score[1] + "��");
		System.out.println("C : " + score[2] + "��");
		System.out.println("D : " + score[3] + "��");
		System.out.println("F : " + score[4] + "��");

		return "i";
	}
}
