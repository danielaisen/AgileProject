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
	
	
	
	public String[] searchAddress(String address) {
		ArrayList<Patient> matches = findAddress(address);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	private ArrayList<Patient> findAddress(String address) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : users) {
			if (p.getAddress() == address) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	public String[] searchNumber(int number) {
		ArrayList<Patient> matches = findNumber(number);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	private ArrayList<Patient> findNumber(int number) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : users) {
			if (p.getPhoneNumber() == number) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	public String[] searchAlive(boolean alive) {
		ArrayList<Patient> matches = findAlive(alive);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	private ArrayList<Patient> findAlive(boolean alive) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : users) {
			if (p.getAlive() == alive) {
				matches.add(p);
			}
		}
		return matches;
	}
}
