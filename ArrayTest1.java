package src.array;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[5]; //5 size의 배열 생성 (int의 5개짜리 묶음)
        //arr을 초기화하지 않고 사용하면 안됨.
        //arr[0]은 초기화되었기 때문에 사용 가능

        //아래 값 초기화 안하면, 초깃값은 {0,0,0,0,0}
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
//        arr[5] = 60; //Index 5 out of bounds for length 5

        // 배열의 길이만큼 반복
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }

        //배열의 선언과 동시에 초기화
        int[] arr2 = new int[]{10, 20, 30, 40, 50}; //배열의 선언과 동시에 초기화
        // arr은 현재 스택 영역에 있는 것
        // {10, 20, 30, 40, 50}은 힙영역에 있음
        // 각 두개는 다른 메모리 공간에 있다.

        //int arr2[] = arr1; => 배열의 메모리 주소 대입
        int[] arr3 = {10, 20, 30, 40, 50}; //가장 많이 사용되는 방법 (new 생략 가능)

        int[] arr4;
        arr4 = new int[]{10, 20, 30, 40, 50};

        int[] arr5;
        //arr5 = {10, 20, 30, 40, 50} //에러
        //똑같은 주소를 두개의 변수가 가지고 있으면 참조레퍼런스 변수는 2개
        //그 후부터 가비지컬렉터는 감시
        System.out.println();
        int[] arr6 = arr2;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + ",");
        }
        System.out.println();

        arr2[0] = 100;
        for(int i=0; i<arr2.length;i++) {
            System.out.print(arr2[i] + ",");
        }
        System.out.println();
        for(int i=0;i<arr6.length;i++) {
            System.out.print(arr6[i] + ",");
        }
    }
}