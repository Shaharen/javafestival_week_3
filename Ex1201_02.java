package dec_01;

public class Ex1201_02 {

	public static void main(String[] args) {
		// findKim 메소드는 String 배열 name을 매개변수로 받는다.
		String[] names = { "Queen", "Tod", "Kim" };

		findKim(names);

	}

	public static void findKim(String[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("Kim")) {
				System.out.println("김서방은 " + (i + 1) + "에 있다.");
			}
		}
	}
}
