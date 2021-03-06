package Hospital;

import java.util.ArrayList;
import java.util.Date;

public abstract class Register<T extends HospitalUser> {
	protected ArrayList<T> users = new ArrayList<T>();
	protected static int serialnum = 0;
	
	public String toString() {
		String a = "";
		for (T u : users) {
			a += u.toString() +"\n";
		}
		return a;
	}
	
	/**
	 * Searches for HospitalUsers with a matching serial number
	 * @param serialnum
	 * @return ArrayList of matching HospitalUsers
	 */
	private ArrayList<T> findSerialnum(int serialnum) {
		ArrayList<T> matches = new ArrayList<T>();
		for (T p : users) {
			if (p.getSerialnum() == serialnum) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	/**
	 * Searches for HospitalUsers with a matching serial number
	 * @param serialnum
	 * @return ArrayList of matching HospitalUsers
	 */
	public String[] searchSerialnum(int serialnum) {
		ArrayList<T> matches = findSerialnum(serialnum);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Finds all the users in the register with matching emails
	 * @param email
	 * @return String array of users, where each element is the .toString()
	 */
	public String[] searchEmail(String email) {
		ArrayList<T> matches = findEmail(email);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Finds all the users in the register with matching emails
	 * @param email
	 * @return ArrayList of users
	 */
	private ArrayList<T> findEmail(String email) {
		ArrayList<T> matches = new ArrayList<T>();
		for (T p : users) {
			if (p.getEmail() == email) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	/**
	 * Searches for HospitalUsers with a matching name
	 * @param name
	 * @return String array of matching HospitalUsers
	 */
	public String[] searchName(String name) {
		ArrayList<T> matches = findName(name);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Searches for HospitalUsers with a matching name
	 * @param name
	 * @return ArrayList of matching HospitalUsers
	 */
	private ArrayList<T> findName(String name) {
		ArrayList<T> matches = new ArrayList<T>();
		for (T p : users) {
			if (p.getName() == name) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	/**
	 * Searches for HospitalUsers with a matching birthday
	 * @param birthday
	 * @return String array of matching HospitalUsers
	 */
	public String[] searchBirthday(Date birthday) {
		ArrayList<T> matches = findBirthday(birthday);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Searches for HospitalUsers with a matching birthday
	 * @param birthday
	 * @return ArrayList of matching HospitalUsers
	 */
	private ArrayList<T> findBirthday(Date birthday) {
		ArrayList<T> matches = new ArrayList<T>();
		for (T p : users) {
			if (p.getBirthday() == birthday) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	/**
	 * Searches for HospitalUsers with a matching surname
	 * @param surname
	 * @return String array of matching HospitalUsers
	 */
	public String[] searchSurname(String surname) {
		ArrayList<T> matches = findSurname(surname);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Searches for HospitalUsers with a matching surname
	 * @param surname
	 * @return ArrayList of matching HospitalUsers
	 */
	private ArrayList<T> findSurname(String surname) {
		ArrayList<T> matches = new ArrayList<T>();
		for (T p : users) {
			if (p.getSurname() == surname) {
				matches.add(p);
			}
		}
		return matches;
	}
	
	/**
	 * Searches for HospitalUsers with a matching Gender
	 * @param role
	 * @return String array of matching HospitalUsers
	 */
	public String[] searchGender(String Gender) {
		ArrayList<T> matches = findGender(Gender);
		String[] m = new String[matches.size()];
		for (int i = 0; i < matches.size(); i++) {
			m[i] = matches.get(i).toString();
		}
		return m;
	}
	
	/**
	 * Searches for HospitalUsers with a matching Gender
	 * @param role
	 * @return ArrayList of matching HospitalUsers
	 */
	private ArrayList<T> findGender(String Gender) {
		ArrayList<T> matches = new ArrayList<T>();
		for (T p : users) {
			if (p.getGender() == Gender) {
				matches.add(p);
			}
		}
		return matches;
	}
}
