package src.operator;

public class OperatorTest1 {

	public static void main(String[] args) {
		int n=10; 
		++n; //증가 연산자 = 단항연산
		System.out.println(n); // 11
		
		int m=10;
		m++;
		System.out.println(m); //11
		
		int z = ++n; //연산의 결괏값을 z에 담음 (int z = ++11)
		System.out.println(z); //12
		System.out.println(n); //12
		
		int a=10, t=100;
		int b=a++; //a를 b에 먼저 담은 후, a + 1
		System.out.println(a); // 11
		System.out.println(b); // 그 전의 값인 10
		
		System.out.println(t++); // 후위연산이므로 100을 출력하고 증가
		System.out.println(t++); // 101
		
		//m=++n;
		//1) n=n+1
		//2) m=n
		
		//m=n++;
		//1)t=n
		//2)n=n+1
		//3)m=t
		//cpu는 타입 다른 것을 연산해줄 수 없어서 자동으로 형변환
		//int 이하의 형변환은 무조건 int로 변환해줌 (byte+short => int+int), 최적화 때문! => 컴파일러가 형변환 하기 전에 알아서 빠르게 해주기 위해형변환
		//1byte전송 시 버스 32개가 cpu에 한번에, 최적화 
		// 10/4 = 2, 10/4.0 = 2.5
		
		byte d = 10;
//		byte b = a+10; //int + int로 변경됨
//		byte b= a+10; // a+10의 결과는 int. byte에 넣을 수 없음 
		byte e = (byte)(d+10);
		System.out.println(e); 
		
		int k = 10000000;
		int v= 10000000;
		int h= k+v;
		System.out.println(h); //overflow라 - 나옴
		
		long w=(long)k*v;
		System.out.println(w);
		
		long p = 1000000 * 1000000L; //하나만 리터럴 해줘도 long으로
		System.out.println(p);
		
		long r = 1000000*1000000/1000000;
		// 곱할 때 이미 오버플로우가 나왔기 때문에 값이 안나옴
		System.out.println(r);
		
		long q = 1000000/1000000*1000000;
		System.out.println(q);
	
		char c1 = 'a'; // ascii 97
//		char c2 = c1+1; //char+int는 int+int로 변경 됨 
		int c2=c1+1;
		System.out.println(c2);
		
		char c3 = ++c1; //증감연산자는 가능
		System.out.println(c3); //b
		
		//1 : 숫자타입, '1' : char타입
	
		int i = '9'-'0'; // -하는 순간 int,int로 변경 됨
		System.out.println(i);
		
		char ch4 = 'B';
		char ch5 = (char)(ch4 + ('a'-'A')); //b
		System.out.println(ch5);
		
		char ch6 = 't';
		char ch7 = (char)(ch6 + ('a'-'A')); //b
		System.out.println(ch7);
		
		// 0.1d = 0.1f => 0.1 오차 무한대 => 0.1d로 변경됨
		// 소숫점을 2진수로 바꾸면 나누는게 아니라 곱함 (역순이 아니라 순서대로 )
		// 0.1d와 0.1f는 다름 => 2진수때문에 나타나는 오차
		
		
		
		

		
		
		
		
		
	}
}
