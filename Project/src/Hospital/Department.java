package Hospital;

import java.util.ArrayList;

public class Department {
	
	private int beds;
	private ArrayList<Patient> patients = new ArrayList<Patient>(); //amount of patients is the amount of beds used
	private ArrayList<Staff> staff = new ArrayList<Staff>();
	private String deptName;
	
	public Department(String deptName, int beds) {
		this.deptName = deptName;
		this.beds = beds;

	}
	
	public Department(String deptName) {
		this.deptName = deptName;
		this.beds = 0;
	}
	
	public int getBedsTotal() {
		return beds;
	}
	
	public int getFreeBeds(){
		return (beds-patients.size());
	}
	
	public int getOccupiedBeds() {
		return patients.size();
	}
	
	public void addNewBeds(int beds) {
		this.beds += beds;
	}
	
	public void removeBeds(int beds) {
		if (this.beds - beds < 0) {
			System.out.println("There aren't that enough beds to subtract that many");
		} 
		else {
			this.beds -= beds;
		}
	
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	public void addStaff(Staff employee) {
		staff.add(employee);
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	public Staff getStaff(Staff employee) { //not working yet to implement
		return employee;
	}
	public Patient getPatient(Patient patient) { //not working yet to implement
		return patient;
	}
	
	public void deletePatient(Patient patient) {
		patients.remove(patient);
	}
	
	public void deleteStaff(Staff employee) {
		staff.remove(employee);
	}
	
//	public int hashCode() { 
//		hash = 103*  //this.getStaff(employee).getSerialnum();
//		return ()
//	}



//public static void main(String[] args) {
//Department d = new Department("hello");
//
//Staff employee = new Staff(1, "a", "b", "c", null, "d", "e");
//
//d.addStaff(employee);
//System.out.println(d.staff);
//}
}
