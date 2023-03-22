package myself;

import java.util.Scanner;

public class ThreeMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the number2 : ");
        int num2 = scan.nextInt();
        System.out.println("Enter the number3 : ");
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Maximum Number is : " + num1);
        } else if (num1 < num2 && num3 < num2) {
            System.out.println("Maximum Number is : " + num2);
        } else {
            System.out.println("Maximum Number is : " + num3);
        }
    }

}