class Parent {
	int x;
	void method1() {}
}

class Child extends Parent {
	int y;
	void method2() {}
}

public class PolinoTest1 {
	public static void main(String[] args) {
//		Parent[] pers = new Parent[5];
//		int n=0;
//		pers[n++] = new Parent();
//		pers[n++] = new Child();
//		pers[n++] = new Child();
		
		Parent p1 = new Parent();
		Child c1 = new Child();

		Parent p2 = new Child(); //upcasting
//		Parent p3 = c1; //upcasting
		
		p1.x=10;
		p1.method1();
		
		c1.x=20;
		c1.y=30;
		c1.method1();
		c1.method2();

		//upcasting�� ��ü�� �ڽ��� new �߾ Ÿ���� �θ��̱� ������ �θ��� ��ɸ� ����� �� �ִ�.
		p2.x=100;
		p2.method1();
		//�ڽ��� ����� ����ϰ� ������ �ڽİ�ü�� �ٽ� downcasting �Ѵ�.
		Child c2 = (Child)p2; //downcasting
		c2.y=200;
		c2.method2();
	}
}