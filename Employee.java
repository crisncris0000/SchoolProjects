public class Employee extends Person implements Comparable<Person>{

	protected String deptName;
	protected static int numEmployees;
	protected int employeeID;
	
	public Employee(){
		deptName = "";
	}
	
	public Employee(String deptName){
		this.deptName = deptName;
	}
	
	public Employee(String name, int birthYear, String deptName){
		super.name = name;
		super.birthYear = birthYear;
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public static int getNumEmployees() {
		return numEmployees;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public boolean equals(Object obj) {
		super.equals(obj);
		
		if(obj instanceof Employee) {
			Employee employee = (Employee) obj;
			if(deptName == employee.deptName && employeeID == employee.employeeID) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String string = String.format("Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
		
		return super.toString() + string;
	}
	
	@Override
	public int compareTo(Person o) {
		return super.compareTo(o);
	}
	
}
