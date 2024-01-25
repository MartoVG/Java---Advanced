import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {

        String path = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();

            while (line != null);{
                int sum  = 0;
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    sum+=symbol;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
