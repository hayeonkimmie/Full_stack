package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("/Users/hayeon/Downloads/Hash/text.txt");
            br = new BufferedReader(fr);
            int data;
            while((data=br.read())!=-1){
                System.out.print((char)data); //한글을 반씩 가져옴. 영문은 2바이트 가져온다고해도, 상관 없는데?
            }
        } catch(IOException e){
            e.printStackTrace();
        } finally{
            try {
                if (br != null) fr.close();
            } catch(IOException e2) {
                // Java에서 입출력 작업(I/O: Input/Output) 중 발생하는 예외를 처리하기 위해 제공되는 예외 클래스
                //파일, 네트워크, 데이터 스트림 등의 작업을 수행할 때 문제가 발생하면 IOException이 발생
                e2.printStackTrace();
            }
        }
    }
}
