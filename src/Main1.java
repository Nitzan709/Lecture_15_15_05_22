import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main1 {
    public static void main(String[] args) {
        openFile();
    }

    private static void openFile() {
        File file = new File("\"C:\\\\Users\\\\jbt\\\\Documents\\\\java_test.txt\"");
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("this is found");
        } catch (FileNotFoundException ex) {
            System.out.println("we didnt found the file");
        }
        System.out.println("continue code");
    }
}
