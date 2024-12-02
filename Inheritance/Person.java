

//explicitly stating that Person class' parent is Object (though its implicit) 
public class Person extends Object {
	private String name;

    //overloaded constructor
	public Person(String name){
		super(); 
		this.name = name; 
	}
	
    //default constructor 
	public Person() {
		//calling the constructor class of the parent -- in this case the Object Class -- this is explicit -- it implicitly already happens 
		super(); 
		name = "";
		
	}
	
    //non-static methods
	public void setName(String name) { 
		this.name = name;
	}
	
	public String getName() {
		return name; 
	}
	
	/*/
	 * override the toString method from the Object class which means to replace
	 * the method it inherited from the Object class with a different definition
	 * or implementation that is more appropriate or makes more sense for the Person class. 
	 * to override, the heading of the method must be the same as the heading 
	 * of the parent class. 
	 */
	
	//when you override, the method header needs to be the exact same name as its parent class (the Object class - the GodFather class). 
	@Override
    public String toString() {
		return "Name: " + name; 
	}
	
	/*/
	 * override the equals method from the Object class
	 * which means to replace the method that is inherited
	 * from the Object class with a different definition or implementation 
	 * that is more appropriate or makes more sense for the Person class
	 * to override the method, the heading of the method must be the same as the heading of the method in the parent class. 
	 * equals method doesn't make sense because it originally is created to check if the memory locations are equal. 
	 */
	
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false; 
		//check if otherObject is actually pointing to an object && if its an instance of the Person class 
	
		if (otherObject != null & otherObject instanceof Person) {
			//the parameter of Object class has no access to the Person class, so we need to create a reference of type Person
			Person otherPerson = (Person)otherObject; 
			//we are comparing the name instance variable (string) in one object to the name instance variable (string) in an another object
			if (this.name.equals(otherPerson.name)) {
				areTheyEqual = true; 
			}
		}
		return areTheyEqual; 
	}
}
