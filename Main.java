
public class Main {

	
	public static void main(String[] args) {
		Course course = new Course(false, 2, "Computer Science", 7);
		Course course1 = new Course(true, 0, "Graduate Student", 69);
		Course course3 = new Course(true, 0, "Not a Student", 67);
		Faculty faculty = new Faculty();
		Course courseArr[] = {course, course1, course3};
		
		
		faculty.addCoursesTaught(courseArr);
		System.out.println(faculty.getAllCoursesTaughtAsString());
	}
}
