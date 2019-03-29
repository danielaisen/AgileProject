package Hospital;

import java.util.ArrayList;
import java.util.Date;

public class PatientRegister extends Register<Patient> {
	
	/**
	 * Adds a patient to the register
	 * @param p Patient
	 */
	public void add(String email, String name, String surname, Date birthday,
			String gender, String address, int number, boolean alive) {
		users.add(new Patient(serialnum, email, name, surname, birthday, gender, address, number, alive));
		serialnum++;
	}
	
	
	/**
	 * Searches for patients with matching address
	 * @param address
	 * @return String array of patients
	 */
	public String[] searchAddress(String address) {
		ArrayList<Patient> matches = findAddress(address);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	/**
	 * Searches for patients with matching address
	 * @param address
	 * @return ArrayList of matching patients
	 */
	private ArrayList<Patient> findAddress(String address) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : users) {
			if (p.getAddress() == address) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	/**
	 * Searches for patients with matching phone numbers
	 * @param number
	 * @return String array of matching patients
	 */
	public String[] searchNumber(int number) {
		ArrayList<Patient> matches = findNumber(number);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Searches for patients with matching phone numbers
	 * @param number
	 * @return ArrayList of matching patients
	 */
	private ArrayList<Patient> findNumber(int number) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : users) {
			if (p.getPhoneNumber() == number) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	/**
	 * Searches for patients with matching alive status
	 * @param alive
	 * @return String array of matching patients
	 */
	public String[] searchAlive(boolean alive) {
		ArrayList<Patient> matches = findAlive(alive);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Searches for patients with matching alive status
	 * @param alive
	 * @return ArrayList of matching patients
	 */
	private ArrayList<Patient> findAlive(boolean alive) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : users) {
			if (p.getAlive() == alive) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	/**
	 * Searches for patients with matching alive status
	 * @param alive
	 * @return ArrayList of matching patients
	 */
	private void moveDepartment(int serialnum, String newDepartmentName) {
		ArrayList<T> match = findSerialnum (serialnum);
		for (Patient p : match) {
			if (p.getDepartment() != newDepartmentName) {
				p.setDepartment(newDepartmentName);
			}
		}
	
	}
	
	
	
	
}
