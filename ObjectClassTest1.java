package stream;

class Person3{
    int age;
    String name;

    public Person3(int age, String name) {
        this.age = age;
        this.name = name;
    }
// eq(equals)입력하면 해도 override 자동완성
    @Override
    public boolean equals(Object obj) { //Object는 Person받기 떄문에, Person으로 입력해야하지만 Object로도
        if(!(obj instanceof Person3)) return false;
        Person3 p = (Person3) obj;
        return age == p.age && name.equals(p.name);
//        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

public class ObjectClassTest1 {
    public static void main(String[] args) {
        // p1, p2주소는 다름
        Person3 p1 = new Person3(20, "홍길동");
        Person3 p2 = new Person3(20, "홍길동");
        System.out.println(p1==p2); // false
        System.out.println(p1.equals(p2)); //true (위에서 오버라이드 안해주면 결괏값 false)
    }
}
