package myself;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = scan.nextInt();

        System.out.println("Multiplication Table of " + num);

        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
        int num1; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num1 = scan.nextInt();

        for(int i=1; i<=num1; i++)
        {
            fact *= i;
        }

        System.out.println("Factorial: "+ fact);



        int base;
        int power;
        int result = 1;

        System.out.print("Enter the base number ");
        base = scan.nextInt();

        System.out.print("Enter the power ");
        power = scan.nextInt();

        for(int i = 1; i <= power; i++)
        {
            result *= base;
        }

        System.out.println("Result: "+ result);



        for ( int i =1; i<=10; i++){
            System.out.println("24 * "+i+"\t=\t"+(24*i));
        }


        for(int i = 1; i<=10; i++){
            for (int j =1; j<=10; j++){
                System.out.print((i*j) + " ");
        }
            System.out.println();
           }













    }
}
