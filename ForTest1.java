package src.loop;

public class ForTest1 {

	public static void main(String[] args) {
//		int sum;
		int i, sum = 0; // 변수 초기화 (int, sum은 main함수 내 지역변수므로 for문 안에서 사용 시 초기화 필수)
		for(i=1; i<=10; i++) {
//			sum += i; // int sum;만 하면, sum을 초기화하지 않았기 때문에 에러 (초기화 하지 않은 값을 읽으려고 해서)
			sum += i;
			System.out.println(String.format("i:%d, sum:%d", i, sum));
			System.out.println("i:" + i + ", sum:" + sum);
		}
		
		System.out.println(String.format("i:%d", i));

	}
}
