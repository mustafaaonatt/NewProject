package PolymorhismExercise;

import java.util.ArrayList;
import java.util.Date;

public class Lecturer extends Employee{
    private ArrayList <String> subjects  = new ArrayList();

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public Lecturer(String fName, String lName, Date DOB, String gender, String employer, String empID) {
        super(fName, lName, DOB, gender, employer, empID);
        this.subjects = new ArrayList<>();



    }
    public void intro(){
        super.intro();
        if(subjects.size() > 0){
            System.out.println("I teach the below subject; ");
            int i = 1;
            for (String sub : subjects){
                if (sub != null);
                System.out.println("\t" + (i++) + ". "+sub);
            }

        }


    }





}
