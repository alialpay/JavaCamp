package homework3_2;

public class Student extends User {
	private String studentCode;

	public Student() {
		super();
		
	}

	public String getStudentCode() {
		studentCode=this.getFirstName().substring(0,2)+getId();
		return studentCode;
	}

	
	
}
