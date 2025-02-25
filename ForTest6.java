package src.loop;

public class ForTest6 {

	public static void main(String[] args) {
		for(int dan=2;dan<10;dan++) {
			for (int i=1; i<10; i++) {
//				System.out.println(String.format("%dx%d=%2d", dan, i, dan * i));
				System.out.print(String.format("%dx%d=%2d\t", dan, i, dan * i));
				
			}
			System.out.println();
		}
	}
}

// d : 정수 출력, s : 문자열, f: 실수, c: 문자형
// 2d : 정수를 출력하면서 최소 너비를 2로 설정합니다. 이 경우, 출력되는 숫자가 2자리가 되도록 공백을 채움

//println : 출력하고 줄까지 바꿔줌 (커서 아래로)