import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterbyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> people = new HashMap<>();
        int count = Integer.parseInt(scanner.nextLine());

        while (count-- > 0){
            String[] tokens  = scanner.nextLine().split(",\\s+");
            people.put(tokens[0], Integer.valueOf(tokens[1]));


        }


        String  coudition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        if ("older".equals(coudition)){
            
        } else if ("younger".equals(coudition)) {
            
        }
    }
}
