package src.loop;

public class WhileTest1 {
    public static void main(String[] args) {
        int i, j, cnt = 5; // cnt 초기화
        i = 0; //i를 while문 지역변수로 사용하기 위해 초기화
        while (i < cnt) { // i < cnt일 동안
            j=0; //j는 2번째 while문 시작 전 초기화
            while (j < cnt-i-1){
                System.out.print(" "); // 실행 출력
                j++; // 증감
            }
            j=0; //j를 0으로 다시 초기화 시키기 => for문에서도 초기화 한번만 되듯이, 초기화는 한번만 되야하기 때문에 while문 바로 직전에 초기화
            while (j < 2 * i + 1) {
                System.out.print("*"); //출력 후에 증감
                j++; // 증감
            }
            System.out.println();
            i++; // 맨처음 while문으로
        }
    }
}

