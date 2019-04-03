package Hospital;


import java.util.ArrayList;
import java.util.Date;

public class PatientRegister extends Register<Patient> {
	
	/**
	 * Adds a patient to the register
	 * @param p Patient
	 */
	public void add(String email, String name, String surname, Date birthday,
			String gender, String address, int number, boolean alive, String department, boolean inpatient) {
		patients.put("p"+Integer.toString(patientserialnum), new Patient("p"+Integer.toString(patientserialnum), email, name, surname, birthday, gender, address, number, alive, department, inpatient));
		patientserialnum++;
	}
	
	protected Patient getPatient(String serialnum) {
		return patients.get(serialnum);
	}
	
	protected String matches(String email, String name, String surname, Date birthday,
			String gender, String address, int number, boolean alive, String department, boolean inpatient) {
			String id = "";
			for (String key: patients.keySet()) {
				if((patients.get(key).getEmail()==email) & (patients.get(key).getName()==name) & (patients.get(key).getSurname()==surname) & (patients.get(key).getBirthday()==birthday) &
						(patients.get(key).getGender()==gender) & (patients.get(key).getAddress()==address) & (patients.get(key).getPhoneNumber()==number) & (patients.get(key).getAlive()==alive)
						& (patients.get(key).getDepartment()==department) & (patients.get(key).getInpatientBool()==inpatient)){
					id = key;
				}
			}
			return id;
	}
	
	public String[] searchInpatient() {
		ArrayList<String> matches = new ArrayList<String>();
		for (String key : patients.keySet()) {
			if (patients.get(key).getInpatientBool() == true) {
				matches.add(patients.get(key).toString());
			}
		}
		
		String[] m = new String[matches.size()];
		m = matches.toArray(m);
		return m;
	}
	
	public String[] searchPhoneNumber(int phoneNumber) {
		ArrayList<String> matches = new ArrayList<String>();
		for (String key : patients.keySet()) {
			if (patients.get(key).getPhoneNumber() == phoneNumber) {
				matches.add(patients.get(key).toString());
			}
		}
		
		String[] m = new String[matches.size()];
		m = matches.toArray(m);
		return m;
	}
	
	public String[] searchAddress(String address) {
		ArrayList<String> matches = new ArrayList<String>();
		for (String key : patients.keySet()) {
			if (patients.get(key).getAddress() == address) {
				matches.add(patients.get(key).toString());
			}
		}
		
		String[] m = new String[matches.size()];
		m = matches.toArray(m);
		return m;
	}
	
	
}
