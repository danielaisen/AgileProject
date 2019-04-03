package Hospital;

import java.util.Date;




//methods: 
//- make a new Patient
//- an edit method to each value (that are not a part of HospitalUser)


public class Patient extends HospitalUser {
	private String address;
	private int phoneNumber;
	private boolean alive;
	
	//This is protected so that there can't be free floating patients. Can only make one in a register
	/**
	 * creates a patient
	 * @param serialnum
	 * @param email
	 * @param name
	 * @param surname
	 * @param birthday
	 * @param gender
	 * @param address
	 * @param number
	 * @param alive
	 */
	protected Patient(int serialnum, String email, String name, String surname, Date birthday,
			String gender, String address, int phoneNumber, boolean alive) {
		set(serialnum, email, name, surname, birthday, gender);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setAlive(alive);
	}
	
	public void setPatient(int serialnum, String email, String name, String surname, Date birthday,
			String gender, String address, int phoneNumber, boolean alive) {
		set(serialnum, email, name, surname, birthday, gender);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setAlive(alive);
		//need to add department
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public boolean getAlive() {
		return alive;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public String toString() {
		return ("Patient: " + getSerialnum() + " ; Name: " + getName() + " " + getSurname() + " ; Gender: " + getGender()); 
	}
}


