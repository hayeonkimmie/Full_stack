// [3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
//의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오

package ex;

public class Exercise3_9 {

	public static void main(String[] args) {
		 char ch = 'z';
		 boolean b = (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9') ;
		 System.out.println(b);
		 }
		 }


// 대문자 비교 : ch>='A' && ch<='Z'
// 소문자 비교: ch>='a' && ch<='z'
// 숫자비교 : ch>='0' && ch<='9'