import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ListFiles {
    public static void main(String[] args) throws IOException {

        //String root = System.getProperty("user.dir");
        String inputPath = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\WriteToFile.txt";

        File f = new File("C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        if (f.isDirectory()) {
            File[]files = f.listFiles();
            for (File file : files) {
                if (!file.isDirectory()){
                    System.out.println(file.getName() + ": " + '[' + file.length()+ ']');
                }
            }
        }


    }
}
