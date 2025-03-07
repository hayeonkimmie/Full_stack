// [3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C = 
//5/9 × (F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점 
//셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)

package ex;

public class Exercise3_7 {

	public static void main(String[] args) {
		 int fahrenheit = 97;
		 float celcius = (float)5/9 * (fahrenheit - 32);
		 System.out.println("Fahrenheit:"+fahrenheit);
		 System.out.println("Celcius:"+celcius);
		 System.out.println("Celcius:"+ Math.round(celcius*100)/100f); //round 함수 사용
		 System.out.println("Celcius:"+ (int)(celcius*100+0.5)/100f);
		 }
}

//예시] 97일 경우 버림, 98일 경우 올림
// 현실의 세계를 알고리즘화
//0.5 이상이면 올림, 이하면 내림이어서 더하기 (자를거기때문)
// 37.77778
// 3777.278 + 0.5 => 3778.2
// 3778/100
