package homework2_1;


public class CourseManager {
	public void addToCart(Course course) {
		System.out.println("Kat?l?m sa?land? :" + course.name);
	}
	public void getCourse (Course course) {
		System.out.println("Kurs ismi : " + course.name);
		System.out.println("E?itmen : " + course.mentor);
		System.out.println("?lerleme durumu : " + course.percentage);
	}
}
