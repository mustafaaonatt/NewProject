import java.util.Locale;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")){
            System.out.println("Input : ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }


        do {
            System.out.println("Input : ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while (!input.equals("quit"));


    }

}
