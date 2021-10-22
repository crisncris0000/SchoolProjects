public class Faculty extends Employee{
	private Course[] coursesTaught;
	
	protected int numCoursesTaught;
	protected boolean isTenured;
	
	public Faculty(){
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
		isTenured = false;
		
	}
	
	public Faculty(boolean isTenured) {
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	
	public Faculty(String deptName, boolean isTenured) {
		super.deptName = deptName;
		this.isTenured = isTenured;
	}
	
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super.name = name;
		super.birthYear = birthYear;
		super.deptName = deptName;
		this.isTenured = isTenured;
	}
	
	public boolean isTenured() {
		return isTenured;
	}
	
	public int getNumCoursesTaught() {
		return numCoursesTaught;
	}
	
	public void setIsTenured(boolean isTenured){
		this.isTenured = isTenured;
	}
	
	public void addCourseTaught(Course course) {
		for(int i = 0; i < coursesTaught.length; i++) {
			if(coursesTaught[i] == null) {
				//Checking length
				coursesTaught[i] = course;
			}
			else {
				System.out.println("Course reached limit!");
				break;
			}
		}
	}
	
	public void addCoursesTaught(Course[] course) {
		for(int i = 0; i < coursesTaught.length; i++) {
			if(coursesTaught[i] == null) {
				if(i >= course.length) {
					break;
				}else {
					coursesTaught[i] = course[i];
				}					
			}
			else {
				System.out.println("Array full!");
			}
		}
	}
	
	public Course getCourseTaught(int index) {
		if(index > 100 || index < 0) {
			return null;
		}
		return coursesTaught[index];
	}
	
	public String getCourseTaughtAsString(int index) {
		if(coursesTaught[index] == null || index > coursesTaught.length || index < 0) {
			return null;
		}
		
		return coursesTaught[index].toString();
	}
	
	public String getAllCoursesTaughtAsString() {
		String courseString = "";
		for(int i = 0; i < coursesTaught.length; i++) {
			if(coursesTaught[i] == null) {
				break;
			}
			courseString += coursesTaught[i] + ", "; 
		}
		return courseString;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Faculty) {
		Faculty faculty = (Faculty) obj;
		if(super.equals(obj) == true) {
			if(this.numCoursesTaught == faculty.numCoursesTaught && this.isTenured == faculty.isTenured) {
				return true;
			}
		}
	}
	return false;
}
	
	@Override
	public String toString() {
		String string = String.format("Faculty: %11s | Number of Courses Taught: %3d |\r\n"
				+ "                                            Courses Taught: %s”, Is Tenured/Not Tenured , numCoursesTaught,\r\n"
				+ "                                            getAllCoursesTaughtAsString() \r\n"
				+ "", coursesTaught);
		return super.toString() + string;
	}
	
	@Override
	public int compareTo(Person o) {
		//Get back to
		return super.compareTo(o);
	}
	
}
