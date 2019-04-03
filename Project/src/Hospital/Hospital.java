package Hospital;

import java.util.Date;

public class Hospital {
	StaffRegister staffRegister = new StaffRegister();
	PatientRegister patientRegister = new PatientRegister();
	DepartmentRegister departmentRegister = new DepartmentRegister();
	
	public void registerPatient(String email, String name, String surname, Date birthday,
			String gender, String address, int number, boolean alive,String department, boolean inpatient) {
		patientRegister.add(email, name, surname, birthday, gender, address, number, alive, department, inpatient);
		departmentRegister.findDepartment(department).addPatient(patientRegister.getPatient(patientRegister.matches(email, name, surname, birthday, gender, address, number, alive, department, inpatient)));
	}
	
	public void registerStaff(String email, String name, String surname, Date birthday, String gender, String role, String department) {
		staffRegister.add(email, name, surname, birthday, gender, role, department);
		departmentRegister.findDepartment(department).addStaff(staffRegister.getStaff(staffRegister.matches(email, name, surname, birthday, gender, role, department)));
	}
	
	public void movePatient(String serialnum, String departmentName) {
		departmentRegister.findDepartment(patientRegister.getPatient(serialnum).getDepartment()).deletePatient(patientRegister.getPatient(serialnum));
		patientRegister.getPatient(serialnum).setDepartment(departmentName);
		departmentRegister.findDepartment(departmentName).addPatient(patientRegister.getPatient(serialnum));
		
	}
	
	public void moveStaffMember(String serialnum, String departmentName) {
		departmentRegister.findDepartment(staffRegister.getStaff(serialnum).getDepartment()).deleteStaff(staffRegister.getStaff(serialnum));
		staffRegister.getStaff(serialnum).setDepartment(departmentName);
		departmentRegister.findDepartment(departmentName).addStaff(staffRegister.getStaff(serialnum));
	}
	
	public void dischargePatient(String serialnum) {
		departmentRegister.findDepartment(patientRegister.getPatient(serialnum).getDepartment()).deletePatient(patientRegister.getPatient(serialnum));
	}
	

	
	public void createDepartment(String departmentName) {
		departmentRegister.createDepartment(departmentName);
	}
	
	public void createDepartment(String departmentName, int numberofbeds) {
		departmentRegister.createDepartment(departmentName, numberofbeds);
	}
}
//patientmember 