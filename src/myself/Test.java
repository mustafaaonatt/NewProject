package myself;

public class Test {
    int x = 3, y = 5;

    public Test(int x, int y){
        initialize(x, y);

    }

    public Test() {
    }

    public void initialize(int x, int y){
        this.x =  x * x;
        this.y = y * y;


    }

    public static void main(String[] args) {
//        int x = 3, y = 5;
        Test obj = new Test();
        Test obj1 = new Test(10 ,15);
        System.out.println(obj1.x + " " + obj1.y);
      //  System.out.println(x + " " + y);
    }
}
