package src.loop;

public class ForTest7 {

	public static void main(String[] args) {
		int i, j;
		for (i=1; i<=9; i++) {
			for(j=2; j<=9; j++) {
				System.out.print(String.format("%dx%d=%d\t", j, i,j*i));
			}
			System.out.println();
		}

	}

}

// 행으로 먼저 접근 해야함
// 2x1, 3x1, 4x1,..