package src.array;

public class VArrayTest1 {
    public static void main(String[] args) {
        int[][] varr1 = new int[3][];// 3행 (각 행은 null상태이고, 열의 개수는 미정)
        //참조변수(주소값)이라 초기값은 null (0이 아님!)

        // 아래와 같이 초기화 (열 크기 할당) => 가변 배열 형태
        varr1[0] = new int[4]; // 첫번째 행에 4개의 열을 할당
        varr1[1] = new int[2];
        varr1[2] = new int[3];
//        System.out.print(varr1);
//        varr1[3] = new int[5]; //3행(0, 1, 2)까지만 있음. 에러

        System.out.println(varr1.length); // 3
        System.out.println(varr1[0].length); // 4 size
        System.out.println(varr1[1].length); // 2
        System.out.println(varr1[2].length); // 3
        System.out.println("==================");

        int[][] darr1 = new int[3][4]; //3행 4열
        System.out.println(darr1.length); // 3
        System.out.println(darr1[0].length); // 4
        System.out.println(darr1[1].length); // 4
        System.out.println(darr1[2].length); // 4
        System.out.println(darr1[0][0] + ", " + darr1[0][1] + ", " + darr1[0][2] + ", " + darr1[0][3]);


    }
}
