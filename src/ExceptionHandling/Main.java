package ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exception = an event that occurs during the execution of a program that,
        //            disrupts the normal flow of instructions


        Scanner input = new Scanner(System.in);


        System.out.println("Enter a whole number to divide: ");
        int x = input.nextInt();

        System.out.println("Enter a whole number to divide by: ");
        int y = input.nextInt();

        int z =x/y;

        System.out.println("result: " + z);
    }
}
