package myself;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 3, -1, 0, 4, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"Mustafa", "Ahmet", "Veli",};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }

}
