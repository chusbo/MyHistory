package class0423;

public class Continue {

	public static void main(String[] args) throws Exception {

		System.out.println("짝수");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("홀수");
		for (int a = 1; a <= 10; a++) {
			if (a % 2 != 1) {
				continue;
			}
			System.out.print(a + " ");
		}
	}

}
