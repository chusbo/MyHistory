package project_;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("영화 예매 사이트");
        System.out.print("아이디: ");
        String inputID = scanner.nextLine();
        System.out.print("비밀번호: ");
        String inputPW = scanner.nextLine();

        String adminID = "추승보";
        String adminPW = "qwer";

        if (inputID.equals(adminID) && inputPW.equals(adminPW)) {
            System.out.println("관리자 아이디입니다.");
            // 여기에 관리자 기능 추가
        } else {
            System.out.println("사용자 아이디입니다.");

            int countA = 0;
            int countB = 0;
            String movie1 = "범죄도시";
            String movie2 = "쿵푸팬더";
            String inputseat = "";

            while (true) {
                System.out.println("-----------------------------영화예매---------------------------");
                System.out.println("1." + movie1 + " | 2." + movie2 + " | 3." + movie1 + " 예매취소 | 4." + movie2 + " 예매취소 | 5.예매종료");
                System.out.println("--------------------------------------------------------------");
                System.out.print("선택: ");
                int moviechoice = scanner.nextInt();

                switch (moviechoice) {
                    case 1:
                        System.out.println(movie1 + " 예매를 선택하셨습니다.");
                        System.out.println("---------------------좌석선택(ex:0a0a)-------------------------");
                        System.out.print("좌석번호 : ");
                        inputseat = scanner.next();
                        if (Pattern.matches("[0-9a-zA-Z]{4}", inputseat)) {
                            countA++;
                        } else {
                            System.out.println("잘못된 형식의 좌석번호입니다. 예매가 되지 않았습니다.");
                        }
                        break;
                    case 2:
                        System.out.println(movie2 + " 예매를 선택하셨습니다.");
                        System.out.println("-----------------------------좌석선택---------------------------");
                        System.out.print("좌석번호 : ");
                        inputseat = scanner.next();
                        if (Pattern.matches("[0-9a-zA-Z]{4}", inputseat)) {
                            countB++;
                        } else {
                            System.out.println("잘못된 형식의 좌석번호입니다. 예매가 되지 않았습니다.");
                        }
                        break;
                    case 3:
                        if (countA > 0) {
                            countA--;
                            System.out.println(movie1 + "의 예매를 취소하셨습니다.");}
                        else
                            System.out.println(movie1 + "의 예매된 좌석이 없습니다.");
                        break;
                    case 4:
                        if (countB > 0) {
                            countB--;
                            System.out.println(movie2 + "의 예매를 취소하셨습니다.");}
                        else
                            System.out.println(movie2 + "의 예매된 좌석이 없습니다.");
                        break;
                    case 5:
                        System.out.println("예매를 종료합니다.");
                        return; // 메인 메소드 종료
                    default:
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                        continue; // 반복문의 처음으로 이동
                }
                
                System.out.println("#현재 영화예매 현황");
                System.out.println(movie1 + " 예매수량= " + countA + "매");
                System.out.println(movie2 + " 예매수량= " + countB + "매");
                System.out.println();
            }
        }
    }
}
