package src.loop;

public class ForTest8 {

	public static void main(String[] args) {
		for (int i=0; i<5; i++) { // 반복횟수 5번
			for (int j=0; j<5; j++) {
				System.out.print("*"); // 개행 없이 프린트
			}
			System.out.println(); // 5개 찍히면 개행
		}
//		System.out.println("*");
	}
}


// 규칙을 먼저 찾고나서 코드화 시키기 
//*****  i=0, j=0~4
//*****  i=1, j=0~4
//*****  i=2, j=0~4
//*****  i=3, j=0~4
//*****  i=4, j=0~4


//*     i=0, j=0
//**	i=1, j=0~1
//***	i=2, j=0~2
//****	i=3, j=0~3
//*****	i=4, j=0~4