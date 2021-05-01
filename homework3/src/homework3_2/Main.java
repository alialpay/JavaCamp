package homework3_2;

public class Main {

	public static void main(String[] args) {
		
		Student ogrenci1 = new Student();
		ogrenci1.setId(1);
		ogrenci1.setFirstName("Ali ");
		ogrenci1.setLastName("Alpay");
		
		StudentManager manager = new StudentManager();
		manager.add(ogrenci1);
		manager.update(ogrenci1);
		manager.joinCamp(ogrenci1);
		
		System.out.println("kodu : " +ogrenci1.getStudentCode());
		
		System.out.println("--------------------");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin ");
		instructor.setLastName("Demiroð");
		instructor.setCourse("Java");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.extendTheCamp(instructor);
		
		
		

	}

}
