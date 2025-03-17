import pac.Student;

public class PackageTest1 {

	public static void main(String[] args) {
		Student s = new Student("100", "design");
		s.setMajor("computer");
		System.out.println(s.getMajor());
	}
}
