import java.io.FileReader;
import java.io.IOException;

public class fileRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
            fr.close(); 
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}