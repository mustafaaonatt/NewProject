package myself;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your borrowing date : ");
        int day = scan.nextInt();
        int fee;
        if(day<=15){
            System.out.println("thanks for returning on time.");
        }else if(day<=20){
              fee = (day-15)*3;

        } else if (day<=25) {
            fee = ((day-20)*5)+15;

        } else if (day<=45) {
            fee = ((day-25)*10)+40;

            System.out.println("You get charged for late fee : " + fee);}
        else{
            System.out.println("Your membership canceled. ");
        }
    }
}
