package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {

        File file = new File("/Users/hayeon/Downloads/Hash/text.txt");
        FileInputStream fis = null;
        try{// 빨대 꽂으려면 객체가 있어야 한다.
            // 파일명을 가져가던지, 파일 객체를 가져가던지 두가지 방법이 있다.
            // true넣으면 append모드를 가져간다 !
            fis = new FileInputStream(new File("/Users/hayeon/Downloads/Hash/text.txt"));
        } catch(IOException e){
            e.printStackTrace();
        } finally{
            try{
                if(fis!=null) fis.close();
            } catch(IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
