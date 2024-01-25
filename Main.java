import java.io.FileInputStream;
import java.io.FileNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String root = "C:\\Users\\Marto\\IdeaProjects\\StackAndQueues\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt";


        try {
            FileInputStream inputStream = new FileInputStream(root);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}