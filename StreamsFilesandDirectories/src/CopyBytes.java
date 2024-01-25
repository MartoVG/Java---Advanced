import java.io.FileInputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\WriteToFile.txt";

        try (FileInputStream fileInputStream = new FileInputStream(inputPath);
             FileInputStream fileOutputStream = new FileInputStream(outputPath)){
            int oneByte = fileInputStream.read();
            while (oneByte >= 0){
                if (oneByte == 10 || oneByte == 32){
                    //fileOutputStream.
                }
                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
