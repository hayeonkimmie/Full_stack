package src.loop;

public class ForTest12 {

	public static void main(String[] args) {
		int cnt = 5;
		for (int i = 1; i <= cnt; i++) {  //int i=0; i<cnt; i++
			for (int j = 5; j > i; j--) { // for (int j=0; j<cnt-i-1; j++) => space 찍기
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// 변하지 않는 값을 가지고 변하는 값 패턴을 찾아내야함
//					j
//   *       i=0, sp=4, st=1 (2*i+1) => 스페이스를 찍어줘야하는 것
//  ***   	i=1, sp=3, st=3
// *****	i=2, sp=2, st=5
//*******	i=3, sp=1, st=7
// sp = 0~(cnt-i-1), st = 0~(2*i-+1)

// 반드시 수업시간 외에 하는 것 외에 따로 알고리즘 + 자료구조 연습하기
// 확장성이 있는 것은 for이지만 ,가끔씩 while문을 권고하기는 함
// 모든 개발은 모방으로부터 시작하니, 알고리즘 풀다가 어려우면, 비슷한 문제를 찾아서 보기
// 흐름도(플로우 차트)를 그리면 좀 도움이 됨

// while문은 초기식과 증감식이 없어서 잘못하면 무한루프 돌 가능성이 높다.
// 참으로 만들어서 언젠간 거짓조건 (반복문 안)을 만들어서 빠져나와야 함
// 이차원 표현하려면 이중 for문, 3중 for문 사용하면 잘못짠거 아닌지 한번쯤 생각해보아야 함
// 운영체제를 큰 데이터를 한번에 올리지 않음. pdf같은 경우도 페이지 스크롤 하면 렌더링해주지, 한번에 X (램, cpu실행횔수와도 관련있음)