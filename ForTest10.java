package src.loop;

public class ForTest10 {

	public static void main(String[] args) {
		int cnt=5;
//		int cnt = 5;
//		for(int i=0; i<cnt; i++) {
//			for(int j=0; j<cnt-i; j++) { //5보다 작아야 해서 cnt-1
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 5; j > i; j--) { //
		for (int i=5; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//*****		i=5, j=0~4
//****		i=4, j=0~3
//***		i=3, j=0~2
//**		i=2, j=0~1
//*			i=1, j=0


//*****		i=0, j=0~4
//****		i=1, j=0~3
//***		i=2, j=0~2
//**		i=3, j=0~1
//*			i=4, j=0

