package PolymorhismExercise;

public class Employee extends Person{
    private String employer;
    private  String empID;

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void intro(){
        System.out.println("I am working at "+employer+". My employee ID is: "+empID+". ");
    }
}
