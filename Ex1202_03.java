package dec_02;

public class Ex1202_03 {

	public static void main(String[] args) {
		// 성적정보가 문자열로 선언되어 있을때
		// 각 성적 별 학생 수를 출력
		// 스트링 메소드 중 스플릿 메소드 사용

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
		System.out.println("A : " + score[0] + "명");
		System.out.println("B : " + score[1] + "명");
		System.out.println("C : " + score[2] + "명");
		System.out.println("D : " + score[3] + "명");
		System.out.println("F : " + score[4] + "명");

		return "i";
	}
}
