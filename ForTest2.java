package src.loop;

public class ForTest2 {

	public static void main(String[] args) {
		int even = 0, odd = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
			} else { //2로 나눠떨어지지 않으면, 홀수 (1, 3, 5, 7, 9)
				odd += i;
			}
//			even += i; //짝수
//			odd += i - 1; //음수
		}
		System.out.println(even); // 짝수 합
		System.out.println(odd); // 홀수 합
	}
}
