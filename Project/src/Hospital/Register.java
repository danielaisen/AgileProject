package Hospital;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public abstract class Register<T extends HospitalUser> {
	
	Map<String,T> patients = new HashMap<String,T>();
	Map<String,T> staff = new HashMap<String,T>();
	
	protected static int staffserialnum = 0;
	protected static int patientserialnum = 0;
	
	
	
	//make dump method (toString)
	

//	public String searchStaffSerialnum(String serialnum) {
//		return getPatient(serialnum).toString());
//	}
//	
//	public String searchPatientSerialnum(String serialnum) {
//		return getStaffSerialnum(serialnum).toString();
//	}
	

	public String[] searchEmail(String email) {
		ArrayList<String> matches = new ArrayList<String>();
		for (String key : patients.keySet()) {
			if (patients.get(key).getEmail() == email) {
				matches.add(patients.get(key).toString());
			}
		}
		
		for (String key : staff.keySet()) {
			if (staff.get(key).getEmail() == email) {
				matches.add(staff.get(key).toString());
			}
		}
		String[] m = new String[matches.size()];
		m = matches.toArray(m);
		return m;
	}
	
	public String[] searchName(String name) {
		ArrayList<String> matches = new ArrayList<String>();
		for (String key : patients.keySet()) {
			if (patients.get(key).getName() == name) {
				matches.add(patients.get(key).toString());
			}
		}
		
		for (String key : staff.keySet()) {
			if (staff.get(key).getName() == name) {
				matches.add(staff.get(key).toString());
			}
		}
		String[] m = new String[matches.size()];
		m = matches.toArray(m);
		return m;
	}

	public String[] searchBirthday(Date birthday) {
		ArrayList<String> matches = new ArrayList<String>();
		for (String key : patients.keySet()) {
			if (patients.get(key).getBirthday() == birthday) {
				matches.add(patients.get(key).toString());
			}
		}
		
		for (String key : staff.keySet()) {
			if (staff.get(key).getBirthday() == birthday) {
				matches.add(staff.get(key).toString());
			}
		}
		String[] m = new String[matches.size()];
		m = matches.toArray(m);
		return m;
	}
	
	public String[] searchSurname(String surname) {
		ArrayList<String> matches = new ArrayList<String>();
		for (String key : patients.keySet()) {
			if (patients.get(key).getSurname() == surname) {
				matches.add(patients.get(key).toString());
			}
		}
		
		for (String key : staff.keySet()) {
			if (staff.get(key).getSurname() == surname) {
				matches.add(staff.get(key).toString());
			}
		}
		String[] m = new String[matches.size()];
		m = matches.toArray(m);
		return m;
	}


}
