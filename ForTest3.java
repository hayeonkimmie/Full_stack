package src.loop;// 1-100사이의 값 중 3의 배수를 제외한 나머지 값의 합 구하기

public class ForTest3 {

	public static void main(String[] args) {
		int i, sum = 0; //변수 i와 sum 초기화
		for (i=1; i<=100; i++) {
			if (i%3 != 0) { //3으로 딱 안 떨어지면, 
				sum += i; // 3의 배수가 아닌 값 모두 더하기 
			}
		}
		System.out.println("3의 배수 제외한 나머지 값의 합:" + sum);
	}
}



