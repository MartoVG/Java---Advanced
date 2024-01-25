import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\" +
                "04-Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\WriteToFile.txt";

        try(FileReader fileReader = new FileReader(inputPath);
            FileWriter fileWriter = new FileWriter(outputPath)){
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNext()){
                if(scanner.hasNextInt()){
                    System.out.println(scanner.nextInt());
                }
                scanner.next();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
