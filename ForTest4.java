package src.loop;// 누적 했을 때 sum이 100이 넘는 순간의 sum값과 i값

public class ForTest4 {

	public static void main(String[] args) {
		int sum = 0, i;
		for (i = 1;; i++) { //i의 조건 없음
			sum += i;
			if (sum >= 100)
				break; //switch, case뿐만 아니라 if문에서도 자주 사용됨.
//			// 조건 식 비교 안하고 안에서 강제로 빠져나오고 싶을 때도 사용함
		}
		
		//강사님은 위의 식을 더 선호함
//		for (i = 1;sum<100; i++) { //i의 조건 없음
//			sum += i;
//			}
		System.out.println(String.format("sum:%d, i:%d", sum, i));

	}
}
