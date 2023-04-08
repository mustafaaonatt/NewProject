import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a number : ");
        int number = input.nextInt();


       if(number % 3 ==0 && number % 5 == 0){
           System.out.println("FizzBuzz");
       } else if (number % 3 == 0) {
           System.out.println("buzz");
       } else if (number % 5 == 0) {
           System.out.println("fizz");
       }else{
           System.out.println(number);
       }
    }
}
