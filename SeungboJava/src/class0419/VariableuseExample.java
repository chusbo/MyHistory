package class0419;

public class VariableuseExample {

	public static void main(String[] args) {
		
		int value=10;
		int result=value+10;		
		System.out.println(result);
		
		int hour=3;
		int minute=5;
		System.out.println(hour+"시간"+minute+"분");
		
		int totalMinute=(hour*60)+minute;
		System.out.println("총"+totalMinute+"분");
		
		int v1=15;
		int v2=0;
		if(v1>10) {
			v2=v1-10;
		}
		int v3=v1+v2+5;
		System.out.println("v3의 값=" + v3);
		
	}

}