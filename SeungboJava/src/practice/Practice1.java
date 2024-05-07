package practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		while(true) {
		System.out.println("점수입력");
		String strX = scan.nextLine();
		x = Integer.parseInt(strX);
				
		if(x<=100)  //true
			{break;}
			System.out.println("100 이하의 값을 입력해주세요.");
			}
			
		if(x==100) {
			System.out.println(x + "점입니다.");
			System.out.println("1등급입니다.");
		}else if(x>=90) {
			System.out.println(x + "점입니다.");
			System.out.println("2등급입니다.");
		}else if(x>=80) {
			System.out.println(x + "점입니다.");
			System.out.println("3등급입니다.");
		}else if(x>=70) {
			System.out.println(x + "점입니다.");
			System.out.println("4등급입니다.");
		}else if(x>=60) {
			System.out.println(x + "점입니다.");
			System.out.println("5등급입니다.");
		}else {
			System.out.println(x + "점입니다.");
			System.out.println("재시험입니다.");
		}
		scan.close();
	}

}
