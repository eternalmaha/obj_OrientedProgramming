class Student {
    //declare instant variables 
    private String name;
    private int conceptTest1;
    private int conceptTest2;
    private int conceptTestFinal;
    private int programmingTest1;
    private int programmingTest2;
    private int programmingTestFinal;

    public Student() {
        name = "";
        conceptTest1 = 0;
        conceptTest2 = 0;
        conceptTestFinal = 0;
        programmingTest1 = 0;
        programmingTest2 = 0;
        programmingTestFinal = 0; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name; 
    }

    public void setConceptTest1(int conceptTest1) {
        if (conceptTest1 >= 0 && conceptTest1 <= 100) {
            this.conceptTest1 = conceptTest1; 
        }
    }

    public int getConceptTest1() {
        return conceptTest1; 
    }

    public void setConceptTest2(int conceptTest2) {
        if (conceptTest2 >= 0 && conceptTest2 <= 100) {
            this.conceptTest2 = conceptTest2; 
        }
    }

    public int getConceptTest2() {
        return conceptTest2; 
    }

    public void setConceptTestFinal(int conceptTestFinal) {
        if (conceptTestFinal >= 0 && conceptTestFinal <= 100) {
            this.conceptTestFinal = conceptTestFinal; 
        }
    }

    public int getConceptTestFinal() {
        return conceptTestFinal; 
    }

    public void setProgrammingTest1(int programmingTest1) {
        if (programmingTest1 >= 0 && programmingTest1 <= 100) {
            this.programmingTest1 = programmingTest1; 
        }
    }

    public int getProgrammingTest1() {
        return programmingTest1; 
    }

    public void setProgrammingTest2(int programmingTest2) {
        if (programmingTest2 >= 0 && programmingTest2 <= 100) {
            this.programmingTest2 = programmingTest2; 
        }
    }

    public int getProgrammingTest2() {
        return programmingTest2; 
    }

    public void setProgrammingTestFinal(int programmingTestFinal) {
        if (programmingTestFinal >= 0 && programmingTestFinal <= 100) {
            this.programmingTestFinal = programmingTestFinal; 
        }
    }

    public int getProgrammingTestFinal() {
        return programmingTestFinal; 
    }


}