package homework2_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course1 = new Course(1, "C# + Angular", "Engin Demiroð", "//image.jpg", 93);
		Course course2 = new Course(2, "Java + React", "Engin Demiroð", "//image.jpg", 16);
		Course course3 = new Course(3, "Temel Kurs", "Engin Demiroð", "//image.jpg", 100);

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.name);
		}

		System.out.println("Listelenen kurs sayýsý :" + courses.length);
		
		Category category1 = new Category(1,"Programlama");
		System.out.println("Kategori ismi : " + category1.categoryName);
		
		CourseManager courseManager = new CourseManager();
		
		System.out.println("------------------");
		courseManager.getCourse(course1);
		System.out.println("------------------");
		courseManager.getCourse(course2);
		System.out.println("------------------");
		courseManager.getCourse(course3);

	}

}
