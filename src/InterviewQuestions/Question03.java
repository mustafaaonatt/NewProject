package InterviewQuestions;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see? ");
        int number = input.nextInt();
        fibonacci(number);
        input.close();
    }

    public static void fibonacci(int number){
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.println(fibo1 + " ");
        System.out.println(fibo2 + " ");

        for (int i = 1; i<number-1; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.println(fibonacci +" " );
        }
    }
}
