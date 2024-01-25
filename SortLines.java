
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;


public class SortLines {
    public static void main(String[] args) throws IOException{

        String root = System.getProperty("user.dir");
        String inputPath = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\WriteToFile.txt";


            List<String> inputData = Files.readAllLines(Paths.get(inputPath));
        Collections.sort(inputData);
         Files.write(Paths.get(outputPath),inputData);


    }
}
