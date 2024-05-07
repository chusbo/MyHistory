package class0422;

import java.util.Scanner;
public class InfinityAndNaNCheck {

	public static void main(String[] args)  throws Exception{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("값을 입력");
		String strx = scanner.nextLine();
		int x = Integer.parseInt(strx);
		
		System.out.println("값을 입력");
		String stry = scanner.nextLine();
		int y = Integer.parseInt(stry);
				
		double z = x / y;
		//double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		//잘못된 코드
		System.out.println(z + 2);
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값이 유효하지 않습니다.");			
		} else {
			System.out.println(z + 2);
		}
		scanner.close();
	}

}
