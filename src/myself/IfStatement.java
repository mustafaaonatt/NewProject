package myself;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter today's temp: ");
        int temp =scan.nextInt();
        if (temp > 30) {
            System.out.println("it's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20) {
            System.out.println("Beautiful day");
        }


    }
}


