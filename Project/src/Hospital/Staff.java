package Hospital;


public class Staff extends HospitalUser {
	
	public Staff() {
		
	}
	
	private String role;
//	private Departmnet department;
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String roleName) {
		this.role = roleName;
	}

	
}
