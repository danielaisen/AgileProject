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
		users.add(new Staff(serialnum, email, name, surname, birthday, gender, role));
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
	private ArrayList<Staff> findRole(String role) {
		ArrayList<Staff> matches = new ArrayList<Staff>();
		for (Staff p : users) {
			if (p.getRole() == role) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	private void moveDepartment(int serialnum, String newDepartmentName) {

		ArrayList<Staff> match = findSerialnum(serialnum);
		for (Staff s : match) {
			if (s.getDepartment() != newDepartmentName) {
				if(DepartmentRegister.departments.containsKey(newDepartmentName)){
					String old = s.getDepartment();
					Department movefrom = DepartmentRegister.departments.get(old);
					Department moveto = DepartmentRegister.departments.get(newDepartmentName);
					movefrom.deleteStaff(s);
					moveto.addStaff(s);
					s.setDepartment(newDepartmentName);
				}
				else {
					System.out.println("There is no department by that name");
				}
			}
		}
	
	}
}
