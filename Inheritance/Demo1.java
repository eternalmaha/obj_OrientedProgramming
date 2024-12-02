public class Demo1 {

	public static void main(String[] args) {
		Person zach = new Person(); 
		zach.setName("Zach");
		System.out.println("Name: " + zach.getName());
		
		Employee ken = new Employee(); 
		ken.setName("Ken"); 
		
		System.out.println("Employee Name: " + ken.getName());
		System.out.println("Employee ID: " + ken.getEmployeeID()); 
	
		/*/
		 * Create an object of the Faculty class using a reference identifier - dan
		 * Set the name to Dan
		 * Set the department to CSC
		 * Print the name, employeeID, and department to screen. 
		 */
		
		Faculty dan = new Faculty(); 
		
		dan.setName("Dan");
		dan.setDepartment("CSC");
		
		System.out.println("Name: " + dan.getName());
		System.out.println("EmployeeID: " + dan.getEmployeeID());
		System.out.println("Department Name: " + dan.getDepartmentName());
		
		
		zach = dan;
        System.out.println(zach.getName()); 

        //type mismatch. Cannot have type Person point to type Faculty but only vice versa because type Faculty inherits from type Person. 
        //Type Person is the parent class of type Faculty, and so will not have Faculty's type. 
        //dan = zach; 
    
	
		
	}
	

}

