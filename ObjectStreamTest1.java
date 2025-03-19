package stream;

import java.io.*;
// Serializable 인터페이스를 구현
// Serializable 인터페이스는 직렬화가 가능한 클래스임을 나타내는 마커 인터페이스
// 이 인터페이스를 구현한 클래스는 객체를 파일에 저장하거나 네트워크로 전송할 수 있습니다.
class Person implements Serializable {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("이름:%s, 나이 :%s", name, age);
    }
}

public class ObjectStreamTest1 {

    // main 메서드 하나만 사용
    public static void main(String[] args) {
        Person p = new Person(20, "홍길동");

        // 객체 직렬화 (객체를 파일로 저장)
        try (FileOutputStream fos = new FileOutputStream("pers.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 객체 역직렬화 (파일에서 객체 읽기)
        load();
    }

    // 역직렬화 메서드
    static void load() {
        try (FileInputStream fis = new FileInputStream("pers.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person p = (Person) ois.readObject();
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
