Inheritance is a critical component of Object Oriented Programming. In our InheritanceProject, we have created a Person, Employee, and Faculty class. 
  - Inheritance shows a clear hierarchy and structure between classes
  - Person is the Parent class, Employee is the child of Person class, and Faculty is the child of  Employee class. 

  In Demo1 class, we show a couple important feature of inheritance. 

  1) When an object, of type Employee is created, with the reference variable ken, we see that ken has access to the setName() method. Since Employee is the child of Person, it has access to all of Person's public and protected behaviors and properties, and its own properties/behaviors. 

  2) While objects are polymorphic (can be of many class types) reference variables are not. In the Demo1 class, we show that a reference variable, once intialized, can only pinpoint to an object that includes its same type. If the object the reference variable is pinpointing to, does not include its type, it will produce a "type mismatch". 
  This is why the reference variable zach, of type Person can point to reference variable dan, of type Faculty. Faculty type objects will include its own type Faculty and Person type, due to inheritance. However, dan, of type Faculty, cannot point or be assigned to zach, of type Person because type Person objects do not have the Faculty type. This created a type mismatch. 

  

  

