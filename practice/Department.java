package practice;

public class Department {
	private int departmentId;
	private String departmentName;
	
	public Department() {
		
	}
	
	public Department(int departmentId,String departmentName) {
		this.departmentId=departmentId;
		this.departmentName=departmentName;
		
	}
	
	public int getDepartmentId() {
		return departmentId;
		
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId=departmentId;
	}
	
	public String getdepartmentName() {
		return departmentName;
		
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName=departmentName;
	}


}
