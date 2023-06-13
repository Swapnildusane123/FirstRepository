package firstexample;

public class Student4 {
	
	String name;
	int rollNumber;
	public Student4(String n, int r) {
		name = n;
		rollNumber = r;
	}
	public void dispayName() {
		System.out.println("Student name :"+name);
	}
	public void rollNumber() {
		System.out.println("Student roll number :"+rollNumber);
	}
	
	public static void main(String[] args) {
		Student4 s = new Student4("swapnil", 13);
		s.rollNumber();
		
	}

}
