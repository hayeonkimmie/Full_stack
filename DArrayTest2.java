package src.array;

public class DArrayTest2 {
    public static void main(String[] args) {
        int[][] darr1 = { //2차원 배열 (3행 4열)
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
        };

        // darr2에 4행 5열 배열 저장하기.
        // 행마다 사이즈 같으니까 하나 잡아서 + 1 (꼭 darr1[0]일 필요는 없음, darr1[1]이어도 됨)
        int[][] darr2 = new int[darr1.length + 1][darr1[0].length + 1]; //행, 열 하나씩 더 잡음 (4행 5열)
        //일단 darr1을 darr2에 복사해보기
        // length를 돌릴 때 darr1기준으로 돌려야 함
        for (int i = 0; i < darr1.length; i++) { //3행까지 출력
            // darr1[0]써줘도 되나, 가변배열일 경우에는 무조건 darr1[i]로 써주어야 함!
            for (int j = 0; j < darr1[i].length; j++) {
                darr2[i][j] = darr1[i][j]; //깊은복사 완료
                darr2[i][4] += darr1[i][j]; //누적해서 더해서 darr2[i행][4]에 저장 => 15, 16, 21, 24, 78
                darr2[3][j] += darr1[i][j]; //배열도 누적 가능
                darr2[3][4] += darr1[i][j];
            }
        }

        for (int i = 0; i < darr2.length; i++) { //darr1을 기준으로 for문 돌려야 함 (작은 것을 기준으로), 안그러면 overflow
            for (int j = 0; j < darr2[i].length; j++) {
                System.out.print(String.format("%2d ", darr2[i][j]));
            }
            System.out.println();
        }
    }
}
//             논리적으로 이해하고 나서 코드로 풀어내기
//




// 1 2  3  4
// 5 6  7  8
// 9 10 11 12


// darr1    darr2
// (0, 0)   (0, 0) + (0, 4), +(3,0) + (3, 4)
// (0, 1)   (0, 1) + (0, 4) + (3, 1) + (3, 4)
// (0, 2)   (0, 2) + (0, 4) + (3, 1) + (3, 4)
// (0, 3)   (0, 3) + (0, 4) + (3, 3) + (3, 4)
// (1, 0)
// (1, 1)
// (1, 2)
// (1, 3)
// (2, 1)
// (2, 2)
// (2, 3)


// 가변배열

