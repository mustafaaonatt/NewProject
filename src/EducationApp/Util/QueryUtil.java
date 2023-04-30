package EducationApp.Util;

public class QueryUtil {
   public String addStd(){
       return "INSERT INTO student (fName, lName, gender, dob) VALUES (?,?,?,?)";
   }
}
