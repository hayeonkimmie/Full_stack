package stream;

import java.io.*;
// 자바에서 입출력 스트림(I/O 스트림)은 기본적으로 바이트 단위로 데이터를 읽고 쓴다는 특성
// 모든 형식의 파일이 바이트 단위로 저장되거나 읽혀지기 때문에, 파일 형식에 관계없이 데이터를 처리할 수 있습니다.
// 컴퓨터 시스템은 기본적으로 바이트 단위로 데이터를 처리(하드웨어와 네트워크 통신은 바이트 단위로 통신)
// 보다 높은 수준에서 효율적으로 데이터를 처리하고 싶다면 버퍼를 활용한 방법이나 문자 단위 입출력을 사용
//  (BufferedInputStream, BufferedOutputStream) => 이 스트림들은 내부적으로 데이터를 일시적으로 저장할 버퍼를 사용하여 여러 바이트를 한 번에 처리하므로 입출력 성능을 향상시킬 수 있습니다.


// 자바에서는 FileOutputStream사용하지 않으면 파일을 생성하거나, 데이터를 파일에 쓸 수 없음 (반드시 스트림 사용)
// 바이너리는 라인이라는 개념이 없다 (데이터의 연속일 뿐이다)
// 맨 앞에 데이터 개수 저장 후 반복문
public class DataStreamTest1 {

    static void writeInfo() {
        int age = 20;
        String name = "홍길동";
        double height = 178.3;

        // FileOutputStream은 데이터를 바이트 단위로 쓰는 클래스 <직접 기본데이터를 처리하지는 못함>
        // DataOutputStream : FileOutputStream을 보조하는 역할을 하며,
        // 기본 데이터 타입들(int, double, String 등)을 쉽게 쓰기 위한 클래스
        // => 각 데이터 타입에 맞는 메서드(writeInt(), writeDouble(), writeUTF() 등)를 제공하여, 데이터를 적절하게 변환하여 바이트 스트림으로 출력할 수 있도록 해줌!

        //InputStream, OutputStream은 FileInputStream & FileOutputStream의 추상클래스
// 텍스트가 아닌 숫자라서 DataOutputStream사용 (InputStreamReader가 아님)
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            //out은 파일에 데이터를 쓸 때 사용, input은 파일에서 데이터를 읽을 때
            fos = new FileOutputStream("info.bin"); //파일에 바이트 단위로 데이터를 출력하는 클래스
            dos = new DataOutputStream(fos);
            // writeUTF() => 문자열의 길이를 2바이트로 저장, 그 뒤에 문자열을 UTF-8 인코딩 방식으로 저장

            // DataOutputStream은 아래와 같이 FileOutputStream과 결합하여 데이터를 바이너리 형식으로 기록하는 기능을 제공

            // writeUTF()와 writeInt() 같은 메서드를 사용하는 이유는 데이터를 파일이나 네트워크로 효율적이고 정확하게 저장/전송하기 위함
            // 각 메서드는 특정 형식의 데이터를 이진 형식으로 저장하여, 데이터를 더 쉽게 읽고 쓸 수 있도록 도와
// writeUTF("안녕하세요")를 사용했다면, "안녕하세요"라는 문자열을 UTF-8로 인코딩하여 파일에 기록
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(height);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos != null) dos.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    static void readInfo() {
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("info.bin");
            dis = new DataInputStream(fis);
            // readUTF()는 먼저 저장된 길이 정보를 읽고, 그 다음에 UTF-8로 인코딩된 문자열을 읽음
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            System.out.println(String.format("%s, %d, %f", name, age, height));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) dis.close(); //읽어올 데이터가 더 이상 없다면, close (자원회수)
            } catch (IOException e2) {
                e2.printStackTrace(); //에러 원인 발생한 위치 추적
            }
        }
    }

    public static void main(String[] args) {
        writeInfo();
        readInfo();
    }
}


