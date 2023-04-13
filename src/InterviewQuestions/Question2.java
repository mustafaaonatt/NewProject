package InterviewQuestions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two number to swap ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        System.out.println("Before swapping : " + n1 + " - " + n2);

        // 1. Way use temp variable
        double temp = n1;
        n1 = n2;
        n2= temp;
        System.out.println("After swapping : " + n1 + " - " + n2);


    }
}
