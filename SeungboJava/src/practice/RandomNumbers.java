package practice;

import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        // 무작위 숫자를 생성하기 위한 Random 객체 생성
        Random random = new Random();
        
        // 결과를 저장할 리스트 생성
        List<Integer> numbers = new ArrayList<>();

        // 중복된 숫자를 방지하기 위한 Set 생성
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        // 6번 반복하여 무작위 숫자 생성 후 리스트에 추가
        for (int i = 0; i < 6; i++) {
            int randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 숫자를 랜덤하게 생성
            numbers.add(randomNumber);
        }
        
        // 리스트를 정렬하여 숫자를 오름차순으로 출력
        Collections.sort(numbers);
        System.out.println("무작위로 선택된 숫자: " + numbers);
    }
}
