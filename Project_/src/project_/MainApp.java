package project_;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanseat = new Scanner(System.in);
		
		System.out.println("영화 예매 사이트");
		System.out.println("아이디 :  ");
		String inputID = scanner.nextLine();
		System.out.println(inputID);
		System.out.println(); 
		
		System.out.println("비밀번호 : ");
		String inputPW = scanner.nextLine();
		System.out.println(inputPW);
		System.out.println();
	
	/*String id = new String("inputID");
	String pw = new String("inputPW");*/

    String id = inputID;
    String pw = inputPW;
    String adminID = "추승보";
    String adminPW = "qwer";
	
	if(id.equals(adminID) && pw.equals(adminPW)) {
		System.out.println("관리자 아이디입니다.");	
		Scanner scanadmin = new Scanner(System.in);
		System.out.println();
	} else {
		System.out.println("사용자 아이디입니다.");
		Scanner scanuser = new Scanner(System.in);
		
		boolean run1 = true;
		int moviechoice = 0;
		int countA = 0;
		int countB = 0;
		String movie1 = "범죄도시";
		String movie2 = "쿵푸팬더";
	
		if (run1) {
			if (moviechoice != 13 && moviechoice != 10) {
				System.out.println();
				System.out.println("-----------------------------영화예매---------------------------");
				System.out.println("1." + movie1 + " | 2." + movie2 + " | 3." + movie1 + " 예매취소 | 4." + movie2 + " 예매취소 | 5.예매종료");
				System.out.println("--------------------------------------------------------------");
				System.out.print("선택: ");
			}
				moviechoice = System.in.read();
		if (moviechoice == 49) { 
			countA++;
			System.out.println(movie1 + " 예매수량= " + countA + "매");
			System.out.println(movie2 + " 예매수량= " + countB + "매");			
			
			System.out.println("-----------------------------좌석선택---------------------------");
			System.out.println("좌석번호 : ");
			String inputseat = scanseat.nextLine();
			System.out.println(inputseat);
			System.out.println(); 
			
		} else if (moviechoice == 50) {
			countB++;
			System.out.println(movie1 + " 예매수량= " + countA + "매");
			System.out.println(movie2 + " 예매수량= " + countB + "매");			

		} else if (moviechoice == 51) {
			countA--;
			System.out.println(movie1 + " 예매수량= " + countA + "매");
			System.out.println(movie2 + " 예매수량= " + countB + "매");

		} else if (moviechoice == 52) {
			countB--;
			System.out.println(movie1 + " 예매수량= " + countA + "매");
			System.out.println(movie2 + " 예매수량= " + countB + "매");
		} else if (moviechoice == 53) { 
			run1 = false;
		}
	}
	//System.out.println("예매 종료");
	}
}
}