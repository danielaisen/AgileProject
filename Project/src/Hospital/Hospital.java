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
//		departmentRegister.findDepartment(patientRegister.findSerialnum(serialnum).getDepartment()).deletePatient(patient.));
//		patientRegister.getPatient(serialnum).setDepartment(departmentName);
//		departmentRegister.findDepartment(departmentName).addPatient(patientRegister.getPatient(serialnum));

	}
	
	public void moveStaffMember(String serialnum, String departmentName) {
//		departmentRegister.findDepartment(staffRegister.getStaff(serialnum).getDepartment()).deleteStaff(staffRegister.getStaff(serialnum));
//		staffRegister.getStaff(serialnum).setDepartment(departmentName);
//		departmentRegister.findDepartment(departmentName).addStaff(staffRegister.getStaff(serialnum));
	}
	
	public void dischargePatient(String serialnum) {
//		departmentRegister.findDepartment(patientRegister.getPatient(serialnum).getDepartment()).deletePatient(patientRegister.getPatient(serialnum));
	}
	

	
	public void createDepartment(String departmentName) {
		departmentRegister.createDepartment(departmentName);
	}
	
	public void createDepartment(String departmentName, int numberofbeds) {
		departmentRegister.createDepartment(departmentName, numberofbeds);
	}
}
//patientmember 