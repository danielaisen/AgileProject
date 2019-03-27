package Hospital;

import java.util.Date;

public abstract class HospitalUser {
	private int serialnum;
	private String email;
	private String name;
	private String surname;
	private Date birthday;
	private String gender;
//	private Department department;
	
	/**
	 * This sets all the fields of the hospitaluser
	 * @param serialnum Serial number
	 * @param email Email address
	 * @param name First name
	 * @param surname Last name
	 * @param birthday Birthday
	 * @param gender Gender
	 */
	public void set(int serialnum, String email, String name, String surname, Date birthday, String gender) {
		setSerialnum(serialnum);
		setEmail(email);
		setName(name);
		setSurname(surname);
		setBirthday(birthday);
		setGender(gender);
	}

	public int getSerialnum() { 
		return serialnum; 
	}
	
	public void setSerialnum(int serialnum) { 
		this.serialnum = serialnum; 
	}
	
	public String getEmail() { 
		return email; 
	}
	
	public void setEmail(String email) { 
		this.email = email; 
	}

	
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

