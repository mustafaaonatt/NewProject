public class Question {
    int ns;
    static int s;

    public Question(int ns) {
        if (s< ns) {
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = " + ns + "s = " + s);
    }

    public static void main(String[] args) {
        Question q1 = new Question(50);
        Question q2 = new Question(125);
        Question q3 = new Question(100);
        q1.doPrint();
        q2.doPrint();
        q3.doPrint();

    }
}
