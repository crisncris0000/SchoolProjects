public class Faculty extends Employee{
	private Course[] coursesTaught = new Course[100];
	
	private int numCoursesTaught;
	private boolean isTenured;
	
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
		super.setDeptName(deptName);
		this.isTenured = isTenured;
	}
	
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super.setName(name);
		super.setBirthYear(birthYear);
		super.setDeptName(deptName);
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
				numCoursesTaught++;
				
			}
			else {
				
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
					numCoursesTaught++;
				}					
			}
			else {
				System.out.println("Array full!");
				break;
			}
		}
	}
	
    public Course getCourseTaught(int index){
        if(index >= coursesTaught.length || index < 0 || coursesTaught[index] == null){
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
    public boolean equals(Object o){
       
        if(o instanceof Faculty){
            Faculty faculty = (Faculty) o;
            if(super.equals(faculty)){
                if(faculty.numCoursesTaught == this.numCoursesTaught && faculty.isTenured == this.isTenured){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String tenured = isTenured == true ? "Is Tenured": "Not Tenured";
        String string = String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", tenured ,numCoursesTaught, getAllCoursesTaughtAsString());
        return super.toString() + string;
        
    }
    
    @Override
    public int compareTo(Person o) {
    	Faculty faculty = (Faculty) o; 
    	if(numCoursesTaught > faculty.numCoursesTaught) {
    		return 1;
    	}
    	else if (numCoursesTaught < faculty.numCoursesTaught){
    		return -1;
    	}
    	return 0;
    }
	
}
