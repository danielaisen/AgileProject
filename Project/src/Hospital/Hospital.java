package Hospital;

import java.util.Date;

public class Hospital {
	StaffRegister staffRegister = new StaffRegister();
	PatientRegister patientRegister = new PatientRegister();
	DepartmentRegister departmentRegister = new DepartmentRegister();
	
	public void registerPatient(String email, String name, String surname, Date birthday,
			String gender, String address, int number, boolean alive,String department, boolean inpatient) {
		int serialnum = patientRegister.add(email, name, surname, birthday, gender, address, number, alive, department, inpatient);
		departmentRegister.findDepartment(department).addPatient(patientRegister.findSerialnum(serialnum));
	}
	
	public void registerStaff(String email, String name, String surname, Date birthday, String gender, String role, String department) {
		int serialnum = staffRegister.add(email, name, surname, birthday, gender, role, department);
		departmentRegister.findDepartment(department).addStaff(staffRegister.findSerialnum(serialnum));
	}
	
	public void movePatient(int serialnum, String departmentName) {
		departmentRegister.movePatient(serialnum, departmentName);
		patientRegister.findSerialnum(serialnum).setDepartment(departmentName);
	}
	
	public void moveStaffMember(int serialnum, String departmentName) {
		departmentRegister.moveStaff(serialnum, departmentName);
		staffRegister.findSerialnum(serialnum).setDepartment(departmentName);
	}
	
	public void dischargePatient(int serialnum) {
		departmentRegister.deletePatient(serialnum);
		//remove from patientRegister
	}
	
	public void dischargeStaff(int serialnum) {
		departmentRegister.deleteStaff(serialnum);
		//remove from staffRegister
	}
	
	public void createDepartment(String departmentName) {
		departmentRegister.createDepartment(departmentName);
	}
	
	public void createDepartment(String departmentName, int numberofbeds) {
		departmentRegister.createDepartment(departmentName, numberofbeds);
	}
}
//patientmember 