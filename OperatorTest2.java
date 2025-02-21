package src.operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		float pi=3.141592f;
		//1) 3141.592
		//2) 3141
		//3) 3.141 (/1000)
		
//		pi = (int)(pi*1000f)/1000f;
//		System.out.println(pi);
	
		// 첫쨰자리 반올림해서 정수로 만들어주는 메서드 : round
	
		pi=Math.round(pi*1000f)/1000f;
		System.out.println(pi);
	}
}
