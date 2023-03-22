package myself;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Year of service : ");
        int yos = scan.nextInt();
        System.out.println("Please enter your Gender : ");
        String gender = scan.next();
        System.out.println("Enter your Graduate ");
        String grade = scan.next();
        int salary = 0;
        if(gender=="male" ) {
            if (yos >= 10 && grade == "post")
                salary = 15000;
            else if ((yos >= 10 && grade == "Graduate") || (yos < 10 && grade == "post")) {
                salary = 10000;
            } else {
                salary = 7000;
            }

        }System.out.println("your salary : " + salary);
    }
}
