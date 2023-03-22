package myself;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {


        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(null);
        points.remove(1);
        points.remove(0);
        points.remove(null);
        System.out.println(points);
    }
}

