package myself;

import java.util.Scanner;

public class Subject {
  /*  19. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
   Calculate percentage and grade according to following:

    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your subjects marks : ");
        int p = input.nextInt();
        int c = input.nextInt();
        int b = input.nextInt();
        int m = input.nextInt();
        int com = input.nextInt();

        int Avg = (p+c+b+m+com)/5;
        System.out.println(Avg);

        if(Avg>=90){
            System.out.println("Grade A");
        } else if (Avg>=80) {
            System.out.println("Grade B");
        } else if (Avg>=70) {
            System.out.println("Grade C");
        } else if (Avg>=60) {
            System.out.println("Grade D");
        } else if (Avg>=40) {
            System.out.println("Grade E");
        }else
            System.out.println("Grade F");

    }



}
