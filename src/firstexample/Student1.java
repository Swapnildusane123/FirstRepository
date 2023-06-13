package firstexample;

public class Student1 {
	// constructor is written by developer- parameterized constructor 
	public Student1(String name) {
		System.out.println("I am constructor :"+name);
	}
	public static void main(String[] args) {
		//String name = "Swapnil";
		//Student1 swapnil = new Student1(name);
		// or just as 
		Student1 swapnil = new Student1("Swapnil");
		
	}

}
