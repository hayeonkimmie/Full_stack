package stream;

import java.io.*;
import java.util.ArrayList;

class MyPerson implements Serializable {
    int age;
    String name;

    MyPerson(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("이름:%s, 나이:%d", name, age);
    }
}

public class ObjectStreamTest2 {
    static void save(ArrayList<MyPerson> arr){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("perList.ser");
            oos = new ObjectOutputStream(fos); // Find해서 클로즈해줘야 하기 때문에 해당 변수를 try 위에 쓴 것
            oos.writeInt(arr.size());  // 리스트 크기 저장
            for(MyPerson p : arr){
                oos.writeObject(p);  // 각 MyPerson 객체 저장
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if (oos != null) oos.close();
            } catch(IOException e2){
                e2.printStackTrace();
            }
        }
    }

    // 파일에서 데이터를 읽어오는 메서드
    static ArrayList<MyPerson> load() {
        ArrayList<MyPerson> list = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("perList.ser");
            ois = new ObjectInputStream(fis);
            int size = ois.readInt();  // 저장된 리스트 크기 읽기
            for(int i = 0; i < size; i++){
                list.add((MyPerson) ois.readObject());  // MyPerson 객체 하나씩 읽기
            }
        } catch(IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e2){
            e2.printStackTrace();
        } finally{
            try{
                if(ois != null) ois.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        return list;  // 읽은 리스트 반환
    }

    public static void main(String[] args) {
        ArrayList<MyPerson> list = new ArrayList<>();
        list.add(new MyPerson(20, "홍길동"));
        list.add(new MyPerson(15, "기길동"));
        list.add(new MyPerson(30, "고길동"));
        list.add(new MyPerson(35, "하길동"));
        list.add(new MyPerson(22, "성길동"));

        save(list);  // 데이터를 파일에 저장

        ArrayList<MyPerson> pers = load();  // `load()` 메서드를 호출하여 데이터 읽기
        for(MyPerson p : pers){
            System.out.println(p);  // 읽어온 객체들 출력
        }
    }
}
