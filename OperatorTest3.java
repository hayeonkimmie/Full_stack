package src.operator;
// 삼항연산자

public class OperatorTest3 {
	public static void main(String[] args) {
		int x = 100, y = 20; // 같은 타입 변수를 선언할 때는 콤마로 구분
		int max = x>y? x:y;
		int min = x<y? x:y;
		System.out.println(max);
		System.out.println(min);
		
//		//대입연산자는 우선순위가 낮다. '='는 같다가 아니라 대입! 
		int a = 10, b = 1;
//////		a += 5; //a=a+5; a의 값을 읽어온 다음에 5를 더함. 
////		a*=5+3 ; //우선순위가 있기 때문에 a=a*(5+3)으로 써야 함
////		// 복합된 연산자는 복합으로만 쓰고 다른 연산자와 섞어서 쓰지 않는 것을 추천 (가독성을 위해)
////		System.out.println(a);
//		
		System.out.println(a>20 && ++b>0); // && and 연산 앞에 있는 a>20 이 거짓이면 뒤에거 안보고 실행
		System.out.println(b);
		
	}
}
