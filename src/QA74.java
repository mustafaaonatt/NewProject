public class QA74 {
    void readCard(int CardNo) throws Exception{
        System.out.println("R");
    }
    void checkCard(int cardNO) throws  RuntimeException{
        System.out.println("c");
    }

    public static void main(String[] args) {
        QA74 ex = new QA74();
        int CardNO = 12344;
      //  ex.readCard(CardNO);
        ex.checkCard(CardNO);
    }
}
