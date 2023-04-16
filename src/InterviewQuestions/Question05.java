package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Question05 {
    /*
    Create a function that takes an array and returns the difference between
    the biggest and the smallest numbers.
    Ask user enter Array elements.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of the array");
        int len = scan.nextInt();

        int arr[] = new int[len];

        System.out.println("Please enter " + len + " array elements");
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int diffOfBigAndSmall = arr[arr.length-1] - arr[0];
        System.out.println("Difference between the greatest and the lowest number is " +diffOfBigAndSmall);
        scan.close();
    }
}
