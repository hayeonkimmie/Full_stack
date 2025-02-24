package src.loop;

// 구구단 2단
public class ForTest5 {

	public static void main(String[] args) {
		int i, result = 0;
		for (i=1; i<10; i++) {
			result = 2*i;
			System.out.println("2x" + i + "=" + result);
			System.out.println(String.format("2x%d=%2d", i, 2*i));
		} //%2d하면 수에 맞춰서 배열해줌
	}
}
