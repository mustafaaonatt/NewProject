package TeleApp;

public class Main {
    public static void main(String[] args) {
//        DeskPhone myPhone = new DeskPhone("1234567890");
//        myPhone.powerOn();
//        myPhone.callPhone("1234567890");
//        myPhone.answer();
        MobilePhone myPhone = new MobilePhone("1234");
        myPhone.powerOn();
        myPhone.callPhone("1234");
        myPhone.answer();
    }

}
