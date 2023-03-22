package myself;

import java.util.Scanner;

/*
A company insures its drivers in the following cases:

If the driver is married
If the driver is unmarried, male & above 30 years of age
If the driver is unmarried, female & above 25 years of age

 */
public class CompanyInsures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Age :");
        int age = input.nextInt();
        System.out.print("Enter the Gender M/F :");
        char gen = input.next().charAt(0);
        System.out.print("Enter the Marital Status U/M :");
        char status = input.next().charAt(0);
        if(status == 'M' || status == 'm')
        {
            System.out.println("Driver should be Insured.");
        }
        else if(status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
        {
            System.out.println("Driver should be Insured.");
        }
        else if(status == 'U' && gen == 'F' && age > 25 || status == 'u' && gen == 'f' && age > 25)
        {
            System.out.println("Driver should be Insured.");
        }
        else
        {
            System.out.println("Driver should not be Insured.");
        }


    }
}
