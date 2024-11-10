
class Student {
    //declare instant variables 
    private String name;
    private double conceptTest1;
    private double conceptTest2;
    private double conceptTestFinal;
    private double programmingTest1;
    private double programmingTest2;
    private double programmingTestFinal;

    //static variables always need to be initialized upon declaration
    private static String professorName = "Kimberly WhiteHouse"; 

    public Student() {
        name = "";
        conceptTest1 = 0;
        conceptTest2 = 0;
        conceptTestFinal = 0;
        programmingTest1 = 0;
        programmingTest2 = 0;
        programmingTestFinal = 0; 
    }

    public static void setProfessorName(String professorName) {
        Student.professorName = professorName ;
    }

    public static String getProfessorName() {
        return professorName; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name; 
    }

    public void setConceptTest1(double conceptTest1) {
        if (conceptTest1 >= 0 && conceptTest1 <= 100) {
            this.conceptTest1 = conceptTest1; 
        }
    }

    public double getConceptTest1() {
        return conceptTest1; 
    }

    public void setConceptTest2(double conceptTest2) {
        if (conceptTest2 >= 0 && conceptTest2 <= 100) {
            this.conceptTest2 = conceptTest2; 
        }
    }

    public double getConceptTest2() {
        return conceptTest2; 
    }

    public void setConceptTestFinal(double conceptTestFinal) {
        if (conceptTestFinal >= 0 && conceptTestFinal <= 100) {
            this.conceptTestFinal = conceptTestFinal; 
        }
    }

    public double getConceptTestFinal() {
        return conceptTestFinal; 
    }

    public void setProgrammingTest1(double programmingTest1) {
        if (programmingTest1 >= 0 && programmingTest1 <= 100) {
            this.programmingTest1 = programmingTest1; 
        }
    }

    public double getProgrammingTest1() {
        return programmingTest1; 
    }

    public void setProgrammingTest2(double programmingTest2) {
        if (programmingTest2 >= 0 && programmingTest2 <= 100) {
            this.programmingTest2 = programmingTest2; 
        }
    }

    public double getProgrammingTest2() {
        return programmingTest2; 
    }

    public void setProgrammingTestFinal(double programmingTestFinal) {
        if (programmingTestFinal >= 0 && programmingTestFinal <= 100) {
            this.programmingTestFinal = programmingTestFinal; 
        }
    }

    public double getProgrammingTestFinal() {
        return programmingTestFinal; 
    }

    /**
     * 
     * @return final percentage score of grade based on all the tests combined.
     */
    public double calcFinalPercentage(){
        return  ((conceptTest1 + conceptTest2 + programmingTest1 + programmingTest2) * 0.40) + ((programmingTestFinal + conceptTestFinal) * 0.40);
    }

    /**
     * student grade is set based on rubric 
     */
    public void setStudentGrade() {
        double studentPercentage = calcFinalPercentage(); 
        if (studentPercentage >= 0 && studentPercentage <= 100) {
            if (studentPercentage >= 90 ) {
                System.out.println("Your grade is A");
            } else if (studentPercentage >= 80){
                System.out.println("Grade is B");
            } else if (studentPercentage >= 70) {
                System.out.println("Grade is C");
            } else if (studentPercentage >= 60) {
                System.out.println("Grade is D");
            } else  {
                System.out.println("Grade is F. Get back to studying!");
            }
        } else {
            System.out.println("Invalid score"); 
        }
    }

}