package stream;

import java.io.*;

public class FileInputStreamTest1 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null; //파일 없을때 생성시켜줌
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            fis = new FileInputStream("/Users/hayeon/Downloads/cat_image.jpeg"); //경로
//             fis = new FIleInputStream("/Users/hayeon/Downloads/text.txt");
//              fos = new FIleInputStream("/Users/hayeon/Downloads/text.txt", true); // true넣으면 두가지 모드, 기존 파일에 append시켜줌!
            // true안 넣으면 새로 다시 쓰는 것
            fos = new FileOutputStream("cutecat.jpeg");
            bis = new BufferedInputStream(fis); //fileinputstream에다가 빨대 꽂은 것 (속도가 더 빨라지고, 크기가 특히 클 때는 훨씬 효율적이다)
            bos = new BufferedOutputStream(fos);



//            int data;
//            while((data=fis.read()) != -1){
//                fos.write((byte)data);
//            }

            byte[] buff = new byte[128];
            int len;
            while((len = bis.read(buff)) > 0) {
                bos.write(buff, 0, len); //len까지 읽으면 쓰레기 값 안들어가고 깔끔해진다.
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(bis!= null) bis.close();
                if(bos!= null) bos.close();
            } catch(IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
