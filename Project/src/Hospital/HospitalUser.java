package Hospital;

import java.util.Date;

public abstract class HospitalUser {
	private int serialnum;
	private String email;
	private String name;
	private String surname;
	private Date birthday;
	private String gender;
	
	public int getSerialnum() { return serialnum; }
	
	public String getEmail() { return email; }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
}

