package src.loop;

public class ForTest11 {

	public static void main(String[] args) {
		// 스페이스 반복문과 스타반복문이 나란히 있어야 함
		int cnt = 5; //5행
		for (int i = 0; i < cnt; i++) { //5행
			for (int j = 0; j < i; j++) { // space
				System.out.print(" ");
			} // i=0일 때 j<i는 거짓/ 그래서 건너 뜀
			for (int j = 0; j < cnt - i; j++) { // j는 재활용가능
				System.out.print("*");
			}
			System.out.println(); //개행
		}
	}
}

// space는 i와 같고, st는 cnt-i
        		  //cnt   j
//*****      i=0, sp=0, st=5 (j)
// ****      i=1, sp=1, st=4
//  ***      i=2, sp=2, st=3
//   **      i=3, sp=3, st=2
//    *      i=4, sp=4, st=1


