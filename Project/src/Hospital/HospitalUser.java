package Hospital;

import java.util.Date;

public abstract class HospitalUser {
	private String serialnum;
	private String email;
	private String name;
	private String surname;
	private Date birthday;
	private String gender;
//	private Department department;
	
	public boolean equals(Object obj) {
		if (obj instanceof HospitalUser) {
			HospitalUser obj2 = (HospitalUser) obj;
			return (obj2.serialnum == this.serialnum); //May need to check all other fields
		}
		return false;
	}
	
	public int hashCode() {
		int hash = 17;
		hash = 31 * hash + Integer.parseInt(serialnum.substring(1,serialnum.length())); //Do for other fields if equals() also checks all other fields
		//hash = 31 * hash + email.hashCode();
		return hash;
	}
	
	public void set(String serialnum, String email, String name, String surname, Date birthday, String gender) {
		setSerialnum(serialnum);
		setEmail(email);
		setName(name);
		setSurname(surname);
		setBirthday(birthday);
		setGender(gender);
	}
	
	public String getSerialnum() { 
		return serialnum; 
	}
	
	public void setSerialnum(String serialnum) { 
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

