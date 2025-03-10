package src.array;

public class ArrayTest3 {
    public static void main(String[] args) {
//        int[] arr1; //int 배열 type, cpu에 4byte잡힌 것 (컴파일 될 때 5가지 배열이 자리잡히는게 아니라 실행될 때 그 때 5개짜리 배열을 잡는 것) = 동적 메모리 할당
        int[] arr1 = new int[5];
        arr1[0] = 10; // 번수 선언하고 데이터 넣기 (초기화)
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        int[] arr2 = new int[] {10, 20, 30, 40, 50}; //초기화 2번째 방법
        int[] arr3 = {10, 20, 30, 40, 50}; //더 간단한 방법. 위의 코드와 메모리 구조가 똑같음.
        //자바는 정적으로 배열을 선언할 수 있는 방법이 없음. 무조건 new로 동적으로 할당만 가능함
        // 배열명 arr2, arr3을 레퍼런스 자료형이라고 한다 (primitive 자료형과는 다른 레퍼런스 자료형의 대표적인 것) ex) 클래스

        System.out.println(arr1[0]);
        System.out.println(arr1.length); // 속성. '.'이 붙는 애들은 앞에있는 애가 하나의 클래스 객체로 존재를 하고, 뒤에거는 속성
        // System은 클래스명, out은 속성명, Println은 괄호가 있으니 메서드라고 함

//        System.out.println(arr1[0]);
//        double[] darr1; //arr1과 darr1의 크기는 같다. 모든 메모리 주소는 4byte.
//        // 하지만 int[], double[]크기는 같다.
//        // 주소를 담을 그릇만 만들어진거지, 배열이 생성된 것이 아니라서 주소 크기가 같은 것, int이든 Double이든
//
//        int[] arr2 = new int[5];//실제로 배열을 잡는 명령어는 new int[5]임. 첫번째 주소 데이터 형태를 담는 그릇이 arr2
//        // new라는 연산자는 힙 영역에 적재함. 20바이트 잡아서 그 주소를 return해서 주는 애가 new 라는 연산자
//        // 힙 영역에 잡히고 개인 주소가 arr 영역에 들어감.
//        // double[] darr1 => 4byte가 스택애 잡혔을 뿐이지, 배열 생성된게 아니다 !
//        // 정적 : staitc. 프로그램을 만드는 시점(컴파일 되는 시점)에 결정이 됨
        // 동적 : 실행될 때 결정되는 것

        int n; // 4byte
        double d; // 8byte
    }
}
