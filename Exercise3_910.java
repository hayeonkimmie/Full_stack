//[3-10] 다음은 소문자를 대문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
//인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를 
//들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.

package ex;

public class Exercise3_910 {

	public static void main(String[] args) {
		 char ch = 'A';
//		 char lowerCase = ( /* (1) */ ) ? ( /* (2) */ ) : ch;
//		 컴퓨터 시스템에서 2의 거듭제곱인 32는 연산에 효율적이고, 대소문자 변환이 쉽게 이루어질 수 있도록 설정
		 
//		 char lowerCase = (ch>='A' && ch <='Z') ? (char)(ch+32) : ch;
		 //위와 동일한 코드 (아래는 32라는 값이 안주어졌을 경우)
		 char lowerCase = (ch>='A' && ch <='Z') ? (char)(ch + 'a'-'A') : ch;

		 System.out.println("upperCase:"+ch);
		 System.out.println("lowerCase:"+lowerCase);
	}
}

// 소문자를 대문자로 변경
// 소문자가 대문자보드 32만큼 큼 => 소문자 = 대문자 + 32
// 대문자 = 소문자 - 32

// 대문자이면 소문자로 변경하는거니까 대문자냐 ? 맞으면 소문자로 변경 : 아니면 그대로 

// 다시 풀어보기!! 특히 연산문제, 제어문