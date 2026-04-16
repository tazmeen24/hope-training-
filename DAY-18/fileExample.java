import java.io.File;
import java.io.IOException;

public class fileExample {
    public static void main(String[] args) {
        try {
            File newFile = new File("test.txt");
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}