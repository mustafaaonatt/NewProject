package InterviewQuestions;

import java.util.Scanner;

public class Question01 {

    // Write a Java Program to reverse a string

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value to reverse");
        String str = input.nextLine();

        // 1.Way : by using StringBuilder();
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        System.out.println(strB.reverse());

        // 2.Way : by using String class
         String revStr = "";
        for (int i= str.length()-1; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }
        System.out.println(revStr);

        // 3. Way create  a method then call the method from main method
        System.out.println(revStr(str));

    }

    public static  String revStr(String str){
        String revStr = "";
        for (int i= str.length()-1; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }
}
