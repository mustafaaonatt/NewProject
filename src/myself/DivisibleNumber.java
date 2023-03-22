package myself;

import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = scan.nextInt();
        if(num%5==0)
            if (num%11==0) {
            System.out.println("This number is divisible by 5 and 11.");
        }else{
            System.out.println("This number is not divisible by 5 and 11. ");
        }
    }
}
