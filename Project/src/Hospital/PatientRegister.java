package Hospital;

import java.util.ArrayList;
import java.util.Date;

public class PatientRegister {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private static int serialnum = 0;
	
	/**
	 * Adds a patient to the register
	 * @param p Patient
	 */
	public void add(String email, String name, String surname, Date birthday,
			String gender, String address, int number, boolean alive) {
		patients.add(new Patient(serialnum, email, name, surname, birthday, gender, address, number, alive));
		serialnum++;
	}
	
	public String toString() {
		String a = "";
		for (Patient p : patients) {
			a += p.toString() +"\n";
		}
		return a;
	}
	
	private ArrayList<Patient> findSerialnum(int serialnum) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : patients) {
			if (p.getSerialnum() == serialnum) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	public String[] searchSerialnum(int serialnum) {
		ArrayList<Patient> matches = findSerialnum(serialnum);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Finds all the patients in the register with matching emails
	 * @param email
	 * @return String array of patients, where each element is the .toString()
	 */
	public String[] searchEmail(String email) {
		ArrayList<Patient> matches = findEmail(email);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Finds all the patients in the register with matching emails
	 * @param email
	 * @return ArrayList of patients
	 */
	private ArrayList<Patient> findEmail(String email) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : patients) {
			if (p.getEmail() == email) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	public String[] searchName(String name) {
		ArrayList<Patient> matches = findName(name);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	private ArrayList<Patient> findName(String name) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : patients) {
			if (p.getName() == name) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	public String[] searchBirthday(Date birthday) {
		ArrayList<Patient> matches = findBirthday(birthday);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	private ArrayList<Patient> findBirthday(Date birthday) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : patients) {
			if (p.getBirthday() == birthday) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	public String[] searchSurname(String surname) {
		ArrayList<Patient> matches = findSurname(surname);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	private ArrayList<Patient> findSurname(String gender) {
		ArrayList<Patient> matches = new ArrayList<Patient>();
		for (Patient p : patients) {
			if (p.getGender() == gender) {
				matches.add(p);
			}
		}
		return matches;
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
		for (Patient p : patients) {
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
		for (Patient p : patients) {
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
		for (Patient p : patients) {
			if (p.getAlive() == alive) {
				matches.add(p);
			}
		}
		return matches;
	}
}
