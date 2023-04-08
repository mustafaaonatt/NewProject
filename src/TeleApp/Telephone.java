package TeleApp;

public interface Telephone {
    void powerOn();
    void dail(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();

}
