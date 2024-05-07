package practice;

public class For {

	public static void main(String[] args) {

		System.out.println("초등학교 반편성 현황");
		for (int a = 1; a <= 6; a++) {
			System.out.println("*****" + a + "학년 *****");
			for (int b = 1; b <= 5; b++) {
				System.out.println(a + "학년" + b + "반");
			}

		}
	}

}
