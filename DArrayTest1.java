package src.array;

public class DArrayTest1 {
    public static void main(String[] args) {

//        C 언어에서 2차원 배열을 선언하면, 실제로는 1차원 배열처럼 메모리에 연속적으로 저장
        //  C언어에서 2차원 배열이 메모리상에 "행 우선" 방식으로 저장되기 때문
        // arr[0][0], arr[0][1], arr[0][2], arr[0][3], arr[1][0], arr[1][1], arr[1][2], arr[1][3], arr[2][0], arr[2][1], arr[2][2], arr[2][3]

        //자바의 2차원 배열은 실제로 배열의 배열로 구현, 각 행(row)은 독립적인 1차원 배열이 되고, 그 배열들을 배열로 묶는 형태로 저장
        int[][] darr1 = new int[3][4];
        System.out.println(darr1.length); //행의 갯수 => 3
        System.out.println(darr1[0].length); //첫 번째 행의 열 개수 출력 => 4
//        arr[0] -> [arr[0][0], arr[0][1], arr[0][2], arr[0][3]]
//        arr[1] -> [arr[1][0], arr[1][1], arr[1][2], arr[1][3]]
//        arr[2] -> [arr[2][0], arr[2][1], arr[2][2], arr[2][3]]

        int[][] darr2 = new int[][]{
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
        };

        // 배열의 배열이기 때문에 인덱스 중괄호를 두번 사용해주어야 함
        int[][] darr3 = {
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
        };

        //darr2의 모든 합
        // 각 행을 접근하려면, 인덱스 사용 => 이중 for문 사용?
        int result = 0;
        for (int i = 0; i < darr2.length; i++){  // int i; i < 3; i++
            for (int j = 0; j < darr2[i].length; j++){ // int j; j < darr[0
                result += darr2[i][j]; // 행, 열을 사용해서 숫자 꺼내서 더하기
                System.out.print(darr2[i][j]);
                System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println(result);  // 78
    }
}
