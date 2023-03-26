package exeptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
   public static void show() throws IOException {
       Account account = new Account();
       try {
           account.withdraw(10);
       } catch (AccountExceptions e) {
           throw new RuntimeException(e);
       }


   }
}