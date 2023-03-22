package myself;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number1 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Number2 : ");
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println("Maximum Number is " + num1);
        } else if (num1 < num2) {
            System.out.println("Maximum Number is " + num2);
        }else{
            System.out.println("Both are equal " + num1);
        }
    }
}