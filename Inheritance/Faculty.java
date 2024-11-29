package Inheritance;

//Faculty inherits all of Employee's member fields, both public and protected
public class Faculty extends Employee {
	
	// instance variable to represent the department to which the faculty member belongs
	private String departmentName; 
	
	//default constructor	
	public Faculty() {
		super(); //Java would call this anyway but its good to be explicit 
		departmentName = ""; 
	}
	
    //first overloaded constructor
	public Faculty(String name){
		super(name);
		departmentName = ""; 
		
	}
	
    //second overloaded constructor 
	public Faculty(String name, String departmentName) {
		super(name);
		this.departmentName = departmentName; 
	}
	
	/*/
	 * Cannot have constructors with the same method header. 
	 * Java will see that another constructor with a String parameter is being defined, 
     * which we already have. It does not understand the parameter names, to realize
     * a difference.  
	 * 
	 * public Faculty(String departmentName) {
	 *      this.departmentName = departmentName; 
	    }
	 
	 */
		
	
	//non-static methods
        //setDepartment
        //getDepartment 

	public void setDepartment(String departmentName) {
		this.departmentName = departmentName; 
	}
	
	public String getDepartmentName() {
		return departmentName; 
	}
	
	/*/
	 * Override the toString method of the employee class,
     * and replace it with a definition that returns the name, the employeeID, and the department 
	 * as a String 
	 */
	
	//super calls the toString method of the parent class, Employee, calling Employee's toString method, saving us lots of time and effort. 
	//In this case, super will bring us both the name and employee ID of the Faculty member. This leaves only the department name to be added. 
	public String toString() {
		return super.toString() + " Department Name: " + getDepartmentName(); 
	}
	
	/*
	 * Override the equals method from the Employee class to return true if the name, employee Id, and department are the same for both objects,
	 * otherwise return false. 
	 */
	
	/*
    //will always be false because again, no two employees will have the same employeeID. 
    //The same concept of overriding can apply here however. 

	public boolean equals(Object otherFaculty) {
		boolean areTheyEqual = false; 
		if (otherFaculty != null & otherFaculty instanceof Faculty) {
		  Faculty secondFaculty = (Faculty)otherFaculty;
		  if(super.equals(otherFaculty) && this.department.equals(otherFaculty.department)) {
            areTheyEqual = true;
            }
        }
            return areTheyEqual;
        }
	}
	*/
	
}
