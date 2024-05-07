package practice;

public class Movie {

	public static void main(String[] args) throws Exception {

		boolean run = true;
		int keyCode = 0;
		int countA = 0;
		int countB = 0;
		String a = "범죄도시";
		String b = "쿵푸팬더";

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println();
				System.out.println("-----------------------------영화예매---------------------------");
				System.out.println("1." + a + " | 2." + b + " | 3." + a + " 예매취소 | 4." + b + " 예매취소 | 5.예매종료");
				System.out.println("--------------------------------------------------------------");
				System.out.print("선택: ");
			}

			keyCode = System.in.read();

			if (keyCode == 49) { // 1의 유니코드49
				countA++;
				System.out.println(a + " 예매수량= " + countA + "매");
				System.out.println(b + " 예매수량= " + countB + "매");

			} else if (keyCode == 50) { // 2의 유니코드50
				countB++;
				System.out.println(a + " 예매수량= " + countA + "매");
				System.out.println(b + " 예매수량= " + countB + "매");

			} else if (keyCode == 51) {
				countA--;
				System.out.println(a + " 예매수량= " + countA + "매");
				System.out.println(b + " 예매수량= " + countB + "매");

			} else if (keyCode == 52) {
				countB--;
				System.out.println(a + " 예매수량= " + countA + "매");
				System.out.println(b + " 예매수량= " + countB + "매");
			} else if (keyCode == 53) { // 3의 유니코드51
				run = false;
			}
		}
		System.out.println("예매 종료");
	}
	
}
