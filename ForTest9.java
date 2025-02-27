package src.loop;

public class ForTest9 {

	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


//*		i = 0, j = 0~1 (0<=0)
//**	i = 1, j = 0~2 (0<=0), (1<=1) 두번 반복
//*** 	i = 2, j = 0~3 (0<=0), (1<=1) (2<=2)
//****	i = 3, j = 0~4
//***** i = 4, j = 0~5  (i = 4) 마지막 횟차 / ((0<=0), (1<=1), (2<=2), (3<=3), (4<=4)