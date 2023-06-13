package firstexample;

public class Student3 {
	// use of parameterized constructor
	// is to initialize instance variable of class
	String name;
	int rollNumber;
	public Student3(String n, int r) {
		name=n;
		rollNumber=r;
	}
	public void dispayName() {
		System.out.println("Student name : "+name);
	}
	public void dispalyRollNumber() {
		System.out.println("Student roll number "+rollNumber);
	}
	public static void main(String[] args) {
		Student3 swapnil = new Student3("Swarup", 13);
		swapnil.dispalyRollNumber();
		swapnil.dispayName();
	}
}
