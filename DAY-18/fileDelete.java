import java.io.File;
public class fileDelete {
    public static void main(String[] args) {
        File file=new File("test.txt");
        if(file.delete()){
            System.out.println("File Deleted"+file.getName());
        }
        else {
            System.out.println("Not able to delete File");
        }
    }
}