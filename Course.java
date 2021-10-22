public class Course implements Comparable<Course>{
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}
	
	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}
	
	public int getCourseNum() {
		return courseNum;
	}
	
	public String getCourseDept() {
		return courseDept;
	}
	
	public int getNumCredits() {
		return numCredits;
	}
	
	public String getCourseName() {
		return " " + courseDept + " " + courseNum;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Course) {
			Course course = (Course) obj; 
			if(isGraduateCourse == course.isGraduateCourse && courseNum == course.courseNum && courseDept == course.courseDept && numCredits == course.numCredits) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String s = String.format("Course: %3s-%3d | Number of Credits: %2d  | Graduate/Undergraduate", courseDept, courseNum, numCredits, isGraduateCourse);
		return s;
	}
	
	@Override
	public int compareTo(Course c) {
		return 1;
	}


}
