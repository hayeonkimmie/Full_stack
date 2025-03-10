package src.array;

public class ArrayTest4 {
    public static void printArray(int[] arr){ //int형 배열을 매개변수로 받는 메서드 printArray
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) { //main 메서드
//        int[] arr1 = new int[5]; //복사가 아니라 공유이다. (얕은 복사) => 두 개 이상의 참조 변수가 동일한 메모리 주소를 가리키고 있음
        int[] arr1 = new int[]{1, 2, 3, 4, 5}; // 5개 int형 배열을 arr1에 넣기
        int[] arr2 = new int[arr1.length]; // 길이는 5
        // arr1과 arr2는 다른배열임


        // 깊은복사(Deep copy)1
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i]; // // arr1의 각 값을 arr2에 복사 (아예 새로운 메모리에 복사)
        }

        // 깊은복사(Deep copy)2
        int[] arr3 = new int[arr1.length];
        //arraycopy는 배열을 빠르고 효율적으로 복사하는 메서드
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);

        int[] arr4 = new int[2];
        System.arraycopy(arr1, 1, arr4, 0, 2); // 0, 1, 2 만 가져와서 arr4에 넣겠다.

        // 깊은복사(Deep copy)3
        int[] arr5 = arr1.clone();
        arr2[0] = 10;
        arr3[0] = 20;
        arr5[0] = 30;

        // printArray의 매개변수는 배열임.
        printArray(arr1); // 1 2 3 4 5
        printArray(arr2); // 10 2 3 4 5
        printArray(arr3); // 20 2 3 4 5
        printArray(arr5); // 30 2 3 4 5

        //얕은복사(Swallow copy) => 참조값이 복사된 것. arr6과 arr1은 같은 곳을 참조
        int[] arr6 = arr1;
        arr6[0] = 50;
        printArray(arr1); // 50 2 3 4 5
        printArray(arr6); // 50 2 3 4 5
    }
}
