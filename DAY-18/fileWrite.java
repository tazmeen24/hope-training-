import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt", true)) {
            writer.write("Write using FileWriter\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}