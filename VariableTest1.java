package src.variable;

public class VariableTest1 {

	public static void main(String[] args) {
		// 이름
		String name = "hayeonkim";
		
		// 나이
		int age = 32;
		
		// 키
		double height = 163.7;
	
	
System.out.println("이름: " + name + ", 나이 :" + age + ", 키: " + height);
System.out.println(String.format("이름: %s, 나이:%d, 키:%.1f", name, age, height));
	}
}
// ~ 연산자 : 2의 보수로 변경해줌
// <<, >> 2진수로 변경해서 왼/오른쪽으로 시프트, 값이 더 커진다.
// 버릴건 버리고, 왼쪽에서 들어옴 >>> 
// 출력
// 이름: 홍길동, 나이 : 40, 키 : 178.3


// 마스크비트
// 자료구조, 알고리즘

// (조건식)? 식1 :식2 => 조건식 괄호 생략가능
// if 문보다 간단한거는 삼항연산자를 사용하는게 빠르고 유리하다, 다만 가독성이 좋지는 않음
// 연산 영역이라 cpu 빠르기 때문
// 자바는 유지보수하기 쉽게 코딩해야함 (변수도 길게,)