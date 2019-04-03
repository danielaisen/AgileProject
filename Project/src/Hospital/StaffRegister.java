package Hospital;

import java.util.ArrayList;
import java.util.Date;

public class StaffRegister extends Register<Staff> {
	
	/**
	 * Adds a staff member to the register
	 * @param serialnum
	 * @param email
	 * @param name
	 * @param surname
	 * @param birthday
	 * @param gender
	 * @param role
	 */
	public void add(String email, String name, String surname, Date birthday, String gender, String role, String department) {
		staff.put("s"+Integer.toString(staffserialnum),new Staff("s"+Integer.toString(staffserialnum), email, name, surname, birthday, gender, role, department));
		staffserialnum++;
	}
	
	protected Staff getStaff(String serialnum) {
		return staff.get(serialnum);
	}
	
	protected String matches(String email, String name, String surname, Date birthday, String gender, String role, String department) {
			String id = "";
			for (String key: staff.keySet()) {
				if((staff.get(key).getEmail()==email) & (staff.get(key).getName()==name) & (staff.get(key).getSurname()==surname) & (staff.get(key).getBirthday()==birthday) &
						(staff.get(key).getGender()==gender) & (staff.get(key).getDepartment()==department) & (staff.get(key).getRole()==role)){
					id = key;
				}
			}
			return id;
	}
	
	public String[] searchRole(String role) {
		ArrayList<String> matches = new ArrayList<String>();
		for (String key : staff.keySet()) {
			if (staff.get(key).getRole() == role) {
				matches.add(patients.get(key).toString());
			}
		}
		
		String[] m = new String[matches.size()];
		m = matches.toArray(m);
		return m;
	}
	
	
}
