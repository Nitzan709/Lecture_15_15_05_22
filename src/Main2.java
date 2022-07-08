import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {
    public static void main(String[] args) {
        creatUrl();
    }

    private static void creatUrl() {
        try {
            URL url = new URL("http://www.google.com");
            System.out.println("this will run");
        } catch (MalformedURLException e) {
            System.out.println("we handle the problem");
        }
        System.out.println("continue code");
    }
}
