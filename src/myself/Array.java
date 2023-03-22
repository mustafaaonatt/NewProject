package myself;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myNum = {10,20,30,40,5};
        System.out.print("Enter " +myNum.length + " values");
        for (int i = 0; i< myNum.length; i++)
            myNum[i] = input.nextInt();
        System.out.print(myNum.toString());


        String[] cars = {"Volvo", "BMW", "Ford","Mazda"};

        String words [] = new String[5];
        System.out.println(cars[0]);
        System.out.println(words[2]);
        System.out.println(myNum[3]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        System.out.println(myNum.length);
        System.out.println(words.length);

        for (int i = 0; i < cars.length; i++)
        System.out.print(cars[i] + " ");

        // for each loop

        for (String i : cars)
            System.out.println(i);

        int [][] myNumbers = { {1,2,3,4}, {5,6,7} };
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        for (int i = 0; i < myNumbers.length; i++)
            for (int j = 0; j < myNumbers[i].length; j++)
                System.out.print(myNumbers[i][j] + " ");




    }



}
