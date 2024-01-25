import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try {
            FileInputStream fileStream = new FileInputStream(path);

            int oneByte = fileStream.read();
            while (oneByte >= 0){
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = fileStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
