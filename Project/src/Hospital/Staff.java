package Hospital;

import java.util.Date;

public class Staff extends HospitalUser {
	private String role;

	public Staff(int serialnum, String email, String name, String surname, Date birthday, String gender, String role) {
		set(serialnum, email, name, surname, birthday, gender);
		setRole(role);
		//need to add department
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String roleName) {
		this.role = roleName;
	}
	public String toString() {
		return ("Staff Member: " + getSerialnum() + " ; Name: " + getName() + " " + getSurname() + " ; Gender: " + getGender()+" ; Role: "+role); 
	}

}
