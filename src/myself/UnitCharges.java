package myself;

import java.util.Scanner;

/*
Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 150 units Rs. 0.75/unit
For next 250 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill


 */
public class UnitCharges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the electricity Unit: ");
        int unit = scan.nextInt();
        float amt, surcharge, bill;

        if(unit<=50){
            amt = unit * 0.5f;
        } else if (unit<=150) {
            amt = unit * 0.75f;
        } else if (unit<=250) {
            amt = unit * 1.20f;
        } else{
            amt = unit * 1.50f;
        }
       surcharge = amt * 0.20f;
       bill = amt + surcharge;

        System.out.println("Total Electricity Bill : " + bill);

    }
}
