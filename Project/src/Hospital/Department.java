package Hospital;



public class Department {
	
	private int beds;
	private int bedsOccupied;
	private Patient[] patients; //amount of patients is the amount of beds used
	private Staff[] staff;
	private String deptName;
	
	public Department(String deptName) {
		
	}
	
	public int getBedsTotal() {
		return beds;
	}
	
	public int getFreeBeds(){
		return (beds-bedsOccupied);
	}
	
	public int getOccupiedBeds() {
		return bedsOccupied;
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
	
	

}
