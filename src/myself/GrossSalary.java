package myself;

import java.util.Scanner;

/*
Write a program to input basic salary of an employee and calculate its Gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
 */
public class GrossSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your basic Salary: ");
        int bs = scan.nextInt();
        float hra, da, tot;

        if(bs<=10000){
            hra = bs * 0.2f;
            da = bs * 0.8f;
        } else if (bs<=20000) {
            hra = bs * 0.25f;
            da = bs * 0.9f;
        } else{
            hra = bs * 0.3f;
            da = bs * 0.95f;
        }
        System.out.println("Gross Salary : " + (bs+hra+da));
    }

}
