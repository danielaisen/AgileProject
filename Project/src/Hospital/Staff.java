package Hospital;

import java.util.Date;

public class Staff extends HospitalUser {
	private String role;
	private String department;
	
	public Staff(int serialnum, String email, String name, String surname, Date birthday, String gender, String role, String department) {
		set(serialnum, email, name, surname, birthday, gender);
		setRole(role);
		setDepartment(department);
		//need to add department
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String roleName) {
		this.role = roleName;
	}
	public String toString() {
		return ("Staff Member: " + getSerialnum() + " ; Name: " + getName() + " " + getSurname() + " ; Gender: " + getGender() + " ; Birthday: " + getBirthday() + " ; Email: " + getEmail() + " ; Role: " + role); 
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}

}

