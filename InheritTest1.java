class Point {
	int x;
	int y;
	Point() {}
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	String info() {
		return String.format("(%d,%d)", x,y);
	}
}

class Shape {
	String color;
	Shape() {
		color="white";
	}
	Shape(String color) {
		this.color=color;
	}
	void draw() {
		System.out.println("색-"+color);
	}
}

class Circle extends Shape {
	Point center;
	int radius;
	
	Circle() {
		center = new Point();
	}
	
	Circle(String color, int cx, int cy, int radius) {
		super(color);
		center = new Point(cx,cy);
		this.radius=radius;
	}
	
	Circle(String color,Point cp, int radius) {
		super(color);
		center = cp;
		this.radius=radius;
	}
	
	void draw() {
		System.out.println(String.format("[원:색-%s,중심점-%s,반지름-%d]", color,center.info(),radius));
	}
}

class Triangle extends Shape {
	Point pos1; 
	Point pos2; 
	Point pos3;
	
	Triangle() {
		pos1 = new Point();
		pos2 = new Point();
		pos3 = new Point();
	}
	
	Triangle(String color, int x1,int y1, int x2,int y2,int x3,int y3) {
		super(color);
		pos1 = new Point(x1,y1);
		pos2 = new Point(x2,y2);
		pos3 = new Point(x3,y3);
	}
	
	Triangle(String color, Point pos1, Point pos2, Point pos3) {
		super(color);
		this.pos1=pos1;
		this.pos2=pos2;
		this.pos3=pos3;
	}
	
	void draw() {
		System.out.println(String.format("[삼각형:색-%s,점1-%s,점2-%s,점3-%s]", color,pos1.info(),pos2.info(),pos3.info()));
	}
}

class Rectangle extends Shape {
	Point start;
	int width;
	int height;
	
	Rectangle() {
		start=new Point();
	}
	
	Rectangle(String color, int sx, int sy, int width, int height) {
		super(color);
		start = new Point(sx,sy);
		this.width=width;
		this.height=height;
	}
	
	Rectangle(String color, Point start, int width, int height) {
		super(color);
		this.start=start;
		this.width=width;
		this.height=height;
	}
	
	void draw() {
		System.out.println(String.format("[사각형:색-%s,시작점-%s,가로-%d,세로-%d]", color,start.info(),width,height));
	}
}

public class InheritTest1 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle("red",3,5,10);
		Circle c3 = new Circle("orange", new Point(7,2), 20);
//		c1.draw();
//		c2.draw();
//		c3.draw();
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("blue",2,3,14,15,26,27);
		Triangle t3 = new Triangle("sky",new Point(5,5), new Point(13,23), new Point(21,55));
//		t1.draw();
//		t2.draw();
//		t3.draw();
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle("gren",5,5,20,10);
		Rectangle r3 = new Rectangle("kaki",new Point(14,15),30,15);
//		r1.draw();
//		r2.draw();
//		r3.draw();
		
		Shape[] shapes = new Shape[9];	
		shapes[0] = c1;
		shapes[1] = c2;
		shapes[2] = c3;
		shapes[3] = t1;
		shapes[4] = t2;
		shapes[5] = t3;
		shapes[6] = r1;
		shapes[7] = r2;
		shapes[8] = r3;
		
		for(int i=0; i<shapes.length; i++) {
			shapes[i].draw();
//			if(shapes[i] instanceof Circle) {
//				((Circle)shapes[i]).draw();
//			} else if(shapes[i] instanceof Triangle) {
//				((Triangle)shapes[i]).draw();
//			} else if(shapes[i] instanceof Rectangle) {
//				((Rectangle)shapes[i]).draw();
//			}
		}
	}
}
//[원:색-white,중심점-(0,0),반지름-0]
//[원:색-red,중심점-(3,5),반지름-10]
//[원:색-orange,중심점-(7,2),반지름-20]
//[삼각형:색-white,점1-(0,0),점2-(0,0),점3-(0,0)]
//[삼각형:색-blue,점1-(2,3),점2-(14,15),점3-(26,27)]
//[삼각형:색-sky,점1-(5,5),점2-(13,23),점3-(21,55)]
//[사각형:색-white,시작점-(0,0),가로-0,세로-0]
//[사각형:색-gren,시작점-(5,5),가로-20,세로-10]
//[사각형:색-kaki,시작점-(14,15),가로-30,세로-15]