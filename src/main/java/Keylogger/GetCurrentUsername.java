package Keylogger;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetCurrentUsername {
    String currentUser = System.getProperty("user.dir");
    String separator = System.getProperty("file.separator");
    Path path = Paths.get(currentUser);
    String pathname = path.toString();
    static GetCurrentUsername getCurrentUsername = new GetCurrentUsername();
    public static void main(String[] args) {
        Thread thread = new Thread(new CheckForUserDir());
        thread.start();
    }

}
