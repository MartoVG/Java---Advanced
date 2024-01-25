import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> element = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            element.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
        }
        String result = String.join(" ", element);
        System.out.println(result);
    }
}
