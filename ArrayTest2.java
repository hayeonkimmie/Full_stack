package src.array;

public class ArrayTest2 {
    public static void arrayPrint(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+". ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5}; // 배열선언
        int[] arr2 = arr1; //arr2에 arr1대입 (메모리주소 복사)
//        arr2[0] = 10; //arr1과 같은 주소에 있는 객체에 접근해서 값 변경
//        for(int i=0; i<arr1.length; i++){
//            System.out.print(arr1[i] +", ");
//        }

        //배열 복제1
        int[] arr3 = new int[arr1.length]; //  arr1 크기만큼 배열 생성
        for(int i = 0; i < arr1.length; i++){ //반복문을 통해서 각 객체들을 복사
            arr3[i] = arr1[i];
        }

        arr3[0] = 10;
        arrayPrint(arr1);
        arrayPrint(arr3);
//        for(int i=0; i<arr1.length; i++){
//            System.out.print(arr1[i]+", ");

        //배열 복제2 => 가장 많이 사용 됨 (배열에 있는 값을 또 다른 메모리 생성해서 복사하는 것)
        // swallow copy => 객체의 주소(참조)만 복사. 복사해도 실체는 1개
        // deep copy (복제) => 완전히 새로운 객체 생성해서, 기존 객체의 값을 복사 (원본과 복사본은 서로 다른 객체, 영향을 주지않음)
        // => 물리적으로 2개 (분리) ->메모리가 새로 생성되어서 복사되어 있는 것

        int[] arr4 = new int[arr1.length];
        // 수동으로 복제하는 방법
        System.arraycopy(arr1, 0, arr4, 0, arr1.length); //arraycopy몇번째에 복사할 것인지
        arr4[1] = 20;
        arrayPrint(arr1);
        arrayPrint(arr4);

        //배열 복제 3
        int[] arr5 = arr1.clone();
        arr5[0] = 100;
        arrayPrint(arr1); // 1. 2. 3. 4. 5. => 원본 변경되지 않음
        arrayPrint(arr5); // 100. 2. 3. 4. 5.

        int a=3, m;
        int k=a; //m과 n은 완전 다른 변수 (메모리가 분리되어있음)

        }
    }
//10, 2, 3, 4,5
