package myself;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int p = 1;
        System.out.println("Enter the A Numbers : ");
        double num1 = in.nextDouble();
        System.out.println("Choose an operator : ");
        char o = in.next().charAt(0);
        System.out.println("Enter the B Numbers : ");
        double num2 = in.nextDouble();

        System.out.println("A number = " + num1);
        System.out.println("B number = " + num2 );
        System.out.println("Operator  = " + o);
        System.out.println("Result : " + num1 + o + num2 + " = ");

        if(o=='+'){
            System.out.println(num1+num2);
        } else if (o=='-') {
            System.out.println(num1-num2);
        } else if (o=='*') {
            System.out.println(num1*num2);
        } else if (o=='/') {
            System.out.println(num1/num2);
        } else if (o=='^') {
            for (int i=1; i<=num2; i++)
                p*=num1;
             System.out.print(p);
        } else{
            System.out.println("Invalid operator");
        }




    }
}
