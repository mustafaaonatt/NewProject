package PolymorhismExercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PollyApp {
    public static void main(String[] args) throws ParseException {
        String myDOB ="12-12-2000";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = sdf.parse(myDOB);

        Lecturer pr01 = new Lecturer("John","Doe",dob,"Male", "AcMe Inc","ABD201910");

        pr01.getSubjects().add("HTML");
        pr01.getSubjects().add("JavaScript");
        pr01.getSubjects().add("PHP");
        pr01.getSubjects().add("Java");

        pr01.intro();

    }
}
