
public class GeneralStaff extends Employee{
	protected String duty;
	
	
	public GeneralStaff() {
		duty = "";
	}
	
	public GeneralStaff(String duty){
		this.duty = duty;
	}
	
	public GeneralStaff(String deptName, String duty){
		super.deptName = deptName;
		this.duty = duty;
	}
	
	public GeneralStaff(String name, int birthYear, String deptName, String duty){
		super.name = name;
		super.birthYear = birthYear;
		super.deptName = deptName;
		this.duty = duty;
	}
	
	public String getDuty() {
		return duty;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof GeneralStaff) {
		GeneralStaff generalStaff = (GeneralStaff) obj;
			if(super.equals(obj) == true) {
			if(this.duty == generalStaff.duty) {
				return true;
			}
		 }	
	}
		return false;
}
	
	@Override
	public String toString() {
		String string = String.format("GeneralStaff: Duty: %10s", duty);
		return super.toString() + string;
	}
	
}
