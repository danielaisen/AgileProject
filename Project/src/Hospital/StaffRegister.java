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
	public void add(String email, String name, String surname, Date birthday, String gender, String role) {
		users.put(serialnum, new Staff(serialnum, email, name, surname, birthday, gender, role));
		serialnum++;
	}
	
	/**
	 * Searches for a Staff with a matching Role
	 * @param role
	 * @return
	 */
	public String[] searchRole(String role) {
		ArrayList<Staff> matches = findRole(role);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Searches for a Staff with a matching Role
	 * @param role
	 * @return
	 */
	protected ArrayList<Staff> findRole(String role) {
		ArrayList<Staff> matches = new ArrayList<Staff>();
		for (Integer key : users.keySet()) {
			if (users.get(key).getRole() == role) {
				matches.add(users.get(key));
			}
		}
		return matches;
	}
}
