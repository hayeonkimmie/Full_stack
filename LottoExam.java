package src.array;

public class LottoExam {
    public static void main(String[] args) {
        //두개는 번갈아 끼울 때는 반드시 임시변수 필요

        int[] ball = new int[45]; //45개의 int배열 생성
        for (int i = 0; i < ball.length ;i++ ){ // ball 배열길이만큼 반복
            ball[i] = i+1; //배열길이만큼 값을 초기화 해주기
        }
        int temp;
        for(int i = 0; i < 1000; i++){
            int t = (int)(Math.random() * 45);
            temp = ball[2];
            ball[2] = ball[t];
            ball[t] = temp;
        }
        for (int i = 0; i < 5; i++){
            System.out.print(ball[i] + ", ");
        }
    }
}

// 1) ball을 1~45까지의 값으로 초기화
// 2) 0~44중의 정수 랜덤값 2개를 구한다.
// 3) 임시변수 temp를 정의한다.
// 4) ball의 idx1번째의 값을 temp변수에 보관한다.
// 5) ball의 idx1번째에 ball의 idx2값을 복사한다.
// 6) temp값을 ball의 idx2번째에 복사한다.
// 7) 2)~6)을 1000회 반복한다.
// 8) ball의 0번째부터 5번째 값을 출력한다.