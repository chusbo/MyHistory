package class0423;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) throws Exception {

		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.println(">");
			inputString = scanner.nextLine();
		} while (!inputString.equals("q"));

		System.out.println();
		System.out.println("프로그램 종료");

		scanner.close();
	}
}
