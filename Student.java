public class Student { 
	private String name; 
	private String course; 
	private float tuitionFee; 
	private int studentNumber; 
	private static int counter = 0; 
	
	public Student(String name, String course, float tuitionFee) {
		this.name = name; 
		this.course = course; 
		this.tuitionFee = tuitionFee; 
		counter++; 
		this.studentNumber = counter;  
	}
	
	public String getName() {
		return name; 
	}
	
	public String getCourse() {
		return course; 
	}
	
	public int getStudentNumber() {
		return studentNumber; 
	}
	
	public float getTuitionFee() {
		return tuitionFee; 
	}
	
	public String toString() {
		return "Student # " + studentNumber + ": " + name + " is taking up " 
				+ course + " with a tuition fee of " + tuitionFee;   
	}
}