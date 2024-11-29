package Inheritance;

//extend means that Employee inherits all the member fields from the Person class
	
public class Employee extends Person { 
	//instance variable
	
	private int employeeID; 
	
	//static variable
	private static int numberOfEmployees = 0; 
	
	//default constructor - super() calls constructor of parent Person class 
	
	public Employee() {
		super(); 
		numberOfEmployees++;
		employeeID = numberOfEmployees; 
	}
	
	//overloaded constructor 
	public Employee(String name) {
		super(name); 
		numberOfEmployees++; 
		employeeID = numberOfEmployees; 
	}

	//setEmployeeID is not written because employeeID
	//is assigned in the constructor and should not
	//change
	
	//non-static methods
	public int getEmployeeID(){
		return employeeID; 
	}
	
	//static methods
	public static int getNumberOfEmployees() {
		return numberOfEmployees; 
	}
	
	/*/
	 * override toString from the Person class to replace it with a definition that returns the name of the employee and
	 * the employee ID as a String
	 */
	
	//this toString method definition  will take precedent over the toString method in Person class when 
	//toString is called on instances of the Employee class since the employee class is the more direct line 
	//even though Person is Employee's parent. 
	public String toString() {
		//return "Name: " + getName() + "\n" + "Employee ID: " + employeeID; 
		// return "Name: " + super.getName() + "\n" + "Employee ID: " + employeeID; 
		
		//super is again used to call the parent class' toString method (Person class in this case)
		//This is the preferred choice because it reduces code in this design choice. 
		return super.toString() +  " Employee ID: " + employeeID; 
	}
	
	/*/
	 * override the equals method from the Person class to return true if the name of the employee and the
	 * employee id are the same for both objects. Otherwise return false; 
	 */
	
	//will of course always be false because two employees will never have the same employee ID 
	public boolean equals(Object otherEmployee) {
		boolean areTheyEqual = false; 
		if (otherEmployee != null && otherEmployee instanceof Employee) {
			Employee secondEmployee = (Employee)otherEmployee;
			//if(this.getName().equals(secondEmployee.getName()) && this.getEmployeeID() == secondEmployee.getEmployeeID()) {
			//}
			if(super.equals(secondEmployee) && this.employeeID == secondEmployee.employeeID) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual; 
	}
	
}


