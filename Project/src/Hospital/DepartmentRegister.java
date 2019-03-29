package Hospital;

import java.util.Map;

public class DepartmentRegister extends Department{
	
	public DepartmentRegister() {
		
	}
	
	private Map<String, Department> departments;
	departments = new Map<String, Department>();
	
	public void createDepartment(String departmentName, int beds) {
		departments.put(departmentName, new Department(departmentName, beds));
	}
	
	public Department findDepartment(String departmentName) {
		return departments.get(departmentName);
	}

}
