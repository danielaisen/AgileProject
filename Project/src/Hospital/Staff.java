package Hospital;

import java.util.Date;

public class Staff extends HospitalUser {
	
	public Staff(int serialnum, String email, String name, String surname, Date birthday, String gender, String role) {
		set(serialnum, email, name, surname, birthday, gender);
		setRole(role);
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
