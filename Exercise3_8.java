// [3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
//[실행결과]
// c=30
// ch=C
// f=1.5
// l = 27000000000
// result=true
 

package ex;

public class Exercise3_8 {

	public static void main(String[] args) {
		 byte a = 10;
		 byte b = 20;
//		 byte c = a + b;
		 byte c = (byte)(a+b);
		 // byte c = (byte) a + b 하면 (byte)a로 형변환이 먼저 이루어지고,a는 여전히 byte타입으로 취급되어 +연산이 이루어짐
		 // 산술연산은 int로 처리되어 byte 형 변수 c에 할당하려고 해서 컴파일오류 발생
		 char ch = 'A';
		 ch = (char) (ch+2);
//		 ch = ch + 2;
//		 String ch = ch + 2;
//		 float f = (float) 3 / 2; //정수는 float에 대입 가능
		 float f = 3f/2;
//		 long l = 3000 * 3000 * 3000; // int type 범위 넘어서 overflow 발생
//		 int 타입은 최대값이 2,147,483,647인데, 3000 * 3000 * 3000 = 27,000,000,000은 이 범위를 초과
		 long l = 3000L * 3000 * 3000;
		 float f2 = 0.1f;
		 double d = 0.1;
//		 boolean result = d==f2; //double형 = float형 => false => double을 float으로 casting
		 boolean result = (float)d == f2;
		 System.out.println("c="+c);
		 System.out.println("ch="+ch);
		 System.out.println("f="+f);
		 System.out.println("l="+l);
		 System.out.println("result="+result);
		 }
		 }
