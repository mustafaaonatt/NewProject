import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesInAction {
    public static void main(String[] args) {
        File myObj = new File("file.txt");
        try {
            if(myObj.createNewFile()){
                System.out.println("File Created : " + myObj);
            }else {
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occured. " + e);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(myObj);
            String output = "Hello World. \n";
            fileOutputStream.write(output.getBytes());
            System.out.println("Successfully wrote to the file. ");
            fileOutputStream.close();

        }catch (IOException e){
            System.out.println("An error occurred");
        }

    }
}
