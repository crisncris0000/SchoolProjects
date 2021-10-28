import java.util.Arrays;

public class Student extends Person{
	private static int numStudents;
	private int studentID;
	private Course coursesTaken[];
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	public Student() {
		coursesTaken = new Course[100];
		numCoursesTaken = 0;
		isGraduate = false;
		major = "undeclared";
		studentID++;
	}

	public Student(boolean isGraduate){
		this.isGraduate = isGraduate;
		studentID++;
	}

	public Student(String major, boolean isGraduate){
		this.major = major;
		this.isGraduate = isGraduate;
		studentID++;
	}

	public Student(String name, int birthYear, String major, boolean isGraduate){
		super.setName(name);
		super.setBirthYear(birthYear);
		this.major = major;
		this.isGraduate = isGraduate;
		studentID++;
	}

	public boolean isGraduate(){
		return isGraduate;
	}

	public int getNumCoursesTaken(){
		return numCoursesTaken;
	}

	public static int getNumStudents(){
		return numStudents;
	}

	public int getStudentID(){
		return studentID;
	}

	public String getMajor(){
		return major;
	}

	public void setIsGraduate(boolean isGraduate){
		this.isGraduate = isGraduate;
	}

	public void setMajor(String major){
		this.major = major;
	}

	public void addCourseTaken(Course course){
		for(int i = 0; i < coursesTaken.length; i++){
			if(coursesTaken[i] == null){
				coursesTaken[i] = course;
				break;
			}
		}
	}

	public  void addCoursesTaken(Course course[]){
		for(int i = 0; i < coursesTaken.length; i++) {
			if(coursesTaken[i] == null) {
				if(i >= course.length) {
					break;
				}else {
					coursesTaken[i] = course[i];
				}
			}
			else {
				System.out.println("Array full!");
			}
		}
	}

	public Course getCourseTaken(int index){
		if(index < 0 || index >= coursesTaken.length){
			return null;
		}
		return coursesTaken[index];
	}

	public String getCourseTakenAsString(int index){
		if(index < 0 || index >= coursesTaken.length){
			return "Invalid";
		}
		return coursesTaken[index].toString();
	}

	public String getAllCoursesTakenAsString(){
		String s = "";
		for(int i = 0; i < coursesTaken.length; i++){
			if(coursesTaken[i] == null){
				break;
			}
			s += coursesTaken[i] + ", ";
		}
		return s;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Faculty) {
			Student student = (Student) obj;
			if(super.equals(obj) == true) {
				if(this.numCoursesTaken == student.numCoursesTaken && this.isGraduate == student.isGraduate && this.major == student.major) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String s = String.format("Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, isGraduate, numCoursesTaken, getAllCoursesTakenAsString());
		return super.toString() + s;
	}
	
	@Override
	public int compareTo(Person o) {
		Student student = (Student) o;

		return super.compareTo(o);
	}
}
