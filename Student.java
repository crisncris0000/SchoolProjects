import java.util.Arrays;

public class Student extends Person{
	protected static int numStudents;
	protected int studentID;
	protected Course coursesTaken[];
	protected int numCoursesTaken;
	protected boolean isGraduate;
	protected String major;
	
	public Student() {
		coursesTaken = new Course[100];
		numCoursesTaken = 0;
		isGraduate = false;
	}

	public Student(boolean isGraduate){
		this.isGraduate = isGraduate;
	}

	public Student(String major, boolean isGraduate){
		this.major = major;
		this.isGraduate = isGraduate;
	}

	public Student(String name, int birthYear, String major, boolean isGraduate){
		super.name = name;
		super.birthYear = birthYear;
		this.major = major;
		this.isGraduate = isGraduate;
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
				if(this.studentID == student.studentID && this.numCoursesTaken == student.numCoursesTaken && this.isGraduate == student.isGraduate) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String s = new String.format("Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, isGraduate, numCoursesTaken, getAllCoursesTakenAsString());
		return super.toString() + s;
	}
}
