package src.array;

import java.util.Scanner;

public class VArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("반 수를 입력하세요:");
        int cnt = sc.nextInt(); // Scans the next token of the input as an int.
        int[][] score = new int[cnt][]; // 반 수를 행으로 해서 배열 int형 score 배열 생성
        for (int i = 0; i < score.length; i++) { //cnt가 2면 ,score.length는 2
            System.out.println((i + 1) + "반의 학생수를 입력하세요:"); //i는 0부터이고, 반은 1부터 시작이니까 i+1
            score[i] = new int[sc.nextInt()]; //학생 수 input 입력 받아서 해당 사이즈만큼의 배열 만들기
        }
        // 점수 입력받기
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) { //학생 수를 열으로 받아서 사용
                System.out.println(String.format("%d반 %d번 학생 점수 입력: ", i + 1, j + 1));
                score[i][j] = sc.nextInt(); // 입력받자마자 바로 배열에 넣기!
            }
        }

        for (int i = 0; i < score.length; i++) {
            int sum=0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j]; //누적 계산
                System.out.print(String.format("%2d ", score[i][j]));
            }
            System.out.println(String.format("평균: %.2f", (double) sum/score[i].length));
        }
    }
}


//    for (int i = 0; i < score[i].length; i++) {
        // darr1[0]써줘도 되나, 가변배열일 경우에는 무조건 darr1[i]로 써주어야 함!
//        for (int j = 0; j < darr1[i].length; j++) {
//            score[i][j] += score[i][j];
//            score[i][4] += score[i][j];
//            darr2[3][j] += darr1[i][j]; //배열도 누적 가능
//            darr2[3][4] += darr1[i][j];


        //3행이고, 각 열이 다른데 입력을 받아서 점수를 넣어보기