// [3-1] 다음 연산의 결과를 적으시오.

package ex;

public class Exercise3_1 {

	public static void main(String[] args) {
		 int x = 2;
		 int y = 5;
		 char c = 'A'; // 'A'의 문자코드는 65
		 System.out.println(1 + x << 33); // 3을 왼쪽으로 시프트(2의 1승)
		 // n << 1은 n을 2배로 만드는 것과 같고, n << 2는 n을 4배로 만드는 것과 같음
		 // 왼쪽 시프트 : 이진수로 표현된 값을 왼쪽으로 지정된 비트만큼 이동시키고 오른쪽은 0으로 채움
		 // 왼쪽으로 한칸 이동할 때마다 값은 2배씩 증가
		 // int는 4byte = 32bit, 1 + 2 = 3 << 33 (32bit인데 <<33 하면 다 지워짐)
		 // 33이 넘어가면 나머지 값 (33/2 = 32, 1) 에러를 내는게 맞는 것 같음
		 System.out.println(y >= 5 || x < 0 && x > 2); //앞에게 true라 뒤에거 연산 안하고 결과 true
		 // 산술, 비교, 논리 순 (우선순위) true or false and false (and가 or보다 우선순위 높음)
		 // or연산은 앞이 참이면, 아예 뒤에거 비교연산을 하지 않음. and의 경우에는 앞의게 거짓이면 뒤에거를 아예 연산하지 않음
		 
		 System.out.println(y += 10 - x++); //13, 현재 x의 값은 2이므로, x++는 2를 반환하고 x는 1 증가하여 3
		 System.out.println(x+=2); //5
		 System.out.println( !('A' <= c && c <='Z')); //false
		 System.out.println('C'-c); //2
		 System.out.println('5'-'0'); //5, 숫자로 바꾸고 싶으면 '0'캐릭어 마이너스
		 System.out.println(c+1); //66
		 System.out.println(++c); //B
		 System.out.println(c++); //B (이후의 값은 c로 남아있음)
		 System.out.println(c); //C
		 }
}

// ctrl + shift + F 하면 예쁘게 정렬해줌
