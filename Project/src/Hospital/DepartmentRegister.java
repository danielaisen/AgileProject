package Hospital;

import java.util.HashMap;
import java.util.Map;

public abstract class DepartmentRegister extends Department{
	
	//departments is a map mapping string department names to objects of department
	protected static Map<String, Department> departments;
	/**
	 * creates a new department and adds it to a map of departments (map: department name -> object of department with that name)
	 * @param departmentName name you want to give to department 
	 * @param beds number of beds you want to add to newly created department
	 */
	
	public DepartmentRegister() {
		this.departments = new HashMap<String, Department>();
	}
	public void createDepartment(String departmentName, int beds) {
		if(this.departments == null) {
			this.departments = new HashMap<String, Department>();
		}
		departments.put(departmentName, new Department(departmentName, beds));
	}
	/**
	 * creates a new department and adds it to a map of departments (map: department name -> object of department with that name)
	 * @param departmentName name you want to give to department - beds is set to 0
	 */
	public void createDepartment(String departmentName) {
		if(this.departments == null) {
			this.departments = new HashMap<String, Department>();
		}
		departments.put(departmentName, new Department(departmentName));
	}
	
	/**
	 * returns an object of type Department whose name matches the input
	 * @param departmentName name of department you want to find
	 * @return
	 */
	public Department findDepartment(String departmentName) {
		return departments.get(departmentName);
	}
	/**
	 * Removes a department from the map of departments, by department name
	 * @param departmentName name of department you want to remove
	 */
	public void deleteDepartment(String departmentName) {
		departments.remove(departmentName);
	}

	

}
