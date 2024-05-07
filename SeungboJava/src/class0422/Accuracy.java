package class0422;

public class Accuracy {

	public static void main(String[] args) {

		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + " 조각이 남는다. ");
		
		System.out.println();
		
		int apple2 = 1;
		
		int totalpieces = apple2 * 10;
		int number2 = 7;
		int temp = totalpieces - number2;
		
		double result2 = temp/10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result2 + " 조각이 남는다. ");
	}

}
