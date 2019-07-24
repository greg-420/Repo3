package day08;



public class EmployeeDetails implements MyProtoType{
	int empID;
	String empName;
	String designation;
	
	public void setEmpID(int empID){
		this.empID = empID;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public MyProtoType clone() throws CloneNotSupportedException{
		System.out.println("\nCloning MyPrototype object");
		return (MyProtoType)super.clone();
	} //end clone
	
	void showRecord(){
		System.out.println("\nEmployee ID\tEmployee Name\tEmployee Designation");
		System.out.println("==================================================");
		System.out.println(empID + "\t\t" + empName + "\t\t" + designation);
	} //end of showRecord
	
}
