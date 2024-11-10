import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

        Student myStudent = new Student(); 

        int option; 

        do {
            System.out.println("This program will record your name and track your grades in this class.");
            System.out.println("Press 1 to update or add your student name");
            System.out.println("Press 2 to update or add your concept test 1");
            System.out.println("Press 3 to update or add your concept test 2");
            System.out.println("Press 4 to update or add your concept test final");
            System.out.println("Press 5 to update or add your programming test 1");
            System.out.println("Press 6 to update or add your programming test 2");
            System.out.println("Press 7 to update or add your programming test final");
            System.out.println("Press 8 to view all entered student scores");
            System.out.println("Press 9 to exit the program after all scores have been entered");
            option = keyboard.nextInt(); 
            keyboard.nextLine(); 
            
            if (option == 1) {
                System.out.println("What's your name");
                String studentName = keyboard.nextLine(); 
                myStudent.setName(studentName);
            } else if (option == 2) {
                System.out.println("What did you get on the first concept test?");
                double newConceptTest1 = keyboard.nextDouble(); 
                myStudent.setConceptTest1(newConceptTest1);
            } else if (option == 3) {
                System.out.println("What did you get on the second concept test?");
                double newConceptTest2 = keyboard.nextDouble(); 
                myStudent.setConceptTest2(newConceptTest2);
            } else if (option == 4) {
                System.out.println("What did you get on finals concept test?");
                double newConceptTestFinal = keyboard.nextDouble(); 
                myStudent.setConceptTestFinal(newConceptTestFinal);
            } else if (option == 5) {
                System.out.println("What did you get on the first programming test?");
                double newProgrammingTest1 = keyboard.nextDouble(); 
                myStudent.setProgrammingTest1(newProgrammingTest1);
            } else if (option == 6) {
                System.out.println("What did you get on the second programming test?");
                double newProgrammingTest2 = keyboard.nextDouble(); 
                myStudent.setProgrammingTest2(newProgrammingTest2);
            } else if (option == 7) {
                System.out.println("What did you get on the finals programming test?");
                double newProgrammingTestFinal = keyboard.nextDouble(); 
                myStudent.setProgrammingTestFinal(newProgrammingTestFinal);
            } else if (option == 8) {
                System.out.println("Viewing Student Test Scores---");
                System.out.println("Student name: " + myStudent.getName() );
                System.out.println("Concept Test 1: " + myStudent.getConceptTest1() );
                System.out.println("Concept Test 2: " + myStudent.getConceptTest2() );
                System.out.println("Concept Final: " + myStudent.getConceptTestFinal() );
                System.out.println("Programming Test 1: " + myStudent.getProgrammingTest1() );
                System.out.println("Programming Test 2: " + myStudent.getProgrammingTest2() );
                System.out.println("Programming Test Final " + myStudent.getProgrammingTestFinal() );

            } else if (option == 9) {
                System.out.println("Goodbye for now! Keep learning and leveling up your education!");
    
            } else {
                 System.out.println("Invalid input. Please choose another option.");
            }
            
        } while(option != 8 ); 
    
    
    keyboard.close();
    
    } //end main

} //end class 
