class Person {
	int age;
	String name;
	Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return String.format("%s,%d", name,age);
	}
}
class Student extends Person {
	String major;
	Student(int age, String name, String major) {
		super(age,name);
		this.major=major;
	}
	
	@Override
	public String toString() {
		return super.toString()+","+major;
	}
	
	String getMajor() {
		return major;
	}
}

public class PolinoTest2 {
	public static void main(String[] args) {
//		Student c = new Student(21,"��浿","�ɸ�");
//		c.toString();
		Person p = new Student(20,"ȫ�浿","��Ÿ"); //upcasting
		System.out.println(p.toString());
		System.out.println(((Student)p).getMajor());
	}
}
