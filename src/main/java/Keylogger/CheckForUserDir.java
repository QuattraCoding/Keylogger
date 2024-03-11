package Keylogger;

import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckForUserDir implements Runnable{
    String currentDir;
    String currentDir_Checker;
    boolean firstTimeChecking = true;
    Path path;
    Window activeWindow;

    public CheckForUserDir(){
        currentDir = System.getProperty("user.dir");
        path = Paths.get(currentDir);
        currentDir = path.toString();
        currentDir_Checker = currentDir;
        System.out.println(currentDir);
    }
    public String pathToString(String pathname){
        activeWindow.getName();
        path = Paths.get(pathname);
        return path.toString();
    }

    public void checkForUpdateInDirectory(){
        currentDir = pathToString(System.getProperty("user.dir"));
        while(currentDir.equals(pathToString(currentDir_Checker)) || firstTimeChecking){
            currentDir_Checker = pathToString(System.getProperty("user.dir"));
            if(firstTimeChecking){
                firstTimeChecking = false;
            }
            if (!currentDir.equals(pathToString(currentDir_Checker))){
                currentDir = pathToString(currentDir_Checker);
                System.out.println(currentDir);
                firstTimeChecking = true;
            }

        }
    }

    @Override
    public void run() {

    }
}
