import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main3 {
    public static void main(String[] args) {
        try {
            openFile();
            System.out.println("everithing went fine");
        }catch (FileNotFoundException e){
            System.out.println("handle the problem");
        }
    }

    private static void openFile() throws FileNotFoundException{
        File file = new File("C:\\Users\\NB\\IdeaProject\\Lecture_15_15_05_22\\scr\\Main1");
        FileReader fileReader = new FileReader(file);

    }
}
