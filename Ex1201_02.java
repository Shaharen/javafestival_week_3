package dec_01;

public class Ex1201_02 {

	public static void main(String[] args) {
		// findKim �޼ҵ�� String �迭 name�� �Ű������� �޴´�.
		String[] names = { "Queen", "Tod", "Kim" };

		findKim(names);

	}

	public static void findKim(String[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("Kim")) {
				System.out.println("�輭���� " + (i + 1) + "�� �ִ�.");
			}
		}
	}
}
