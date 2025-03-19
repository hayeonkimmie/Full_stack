package stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {

        FileInputStream fi = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            //바이트를 문자로 변환 (한글, 영어로 번역은 안되고 바이트단위로만 읽는다)
            fi = new FileInputStream("/Users/hayeon/Downloads/Hash/text.txt");
            // "KSC5601": 한국어(EUC-KR) 문자 인코딩을 사용

            // 바이트 스트림을 문자 스트림으로 변환 (인코딩에 맞게 변경)
//            BufferedReader를 사용하면 **버퍼(buffer)**를 이용해서 데이터를 한 줄(readLine())씩 읽을 수 있어.
//            만약 BufferedReader 없이 InputStreamReader만 사용하면 한 글자(char) 단위로 읽어야 해서 비효율적이야.
            isr = new InputStreamReader(fi, "UTF-8");
//            BufferedReader: 문자를 버퍼에 저장하면서 한 줄씩 읽기 가능
            // InputStreamReader로 변환된 문자 스트림을 한 줄 단위로 읽는기능


//            DataOutputStream은 바이트 스트림을 다룰 때 쓰는 출력 스트림이야.
//            보통 DataOutputStream은 정수, 실수 같은 기본형 데이터를 바이트로 저장할 때 사용해.
//            (즉, 바이트 데이터를 쓰는 용도이지, 텍스트 파일을 읽는 용도가 아니야.)
            br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        } finally{
            try{
                if(fi!=null) fi.close();
                // 인터넷이 끊이거나, 웹사이트 응답하지않으면 해당 예외 발생
                // 파일이 없거나, 네트워크 문제, 권한 문제 등으로 인해 발생 가능
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
