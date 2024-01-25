import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> input = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Double::parseDouble).
                collect(Collectors.toList());

        Map<Double, Integer> numbers = new LinkedHashMap<>();

        for (Double num : input) {
            numbers.putIfAbsent(num,0);
            int newCout = numbers.get(num)+1;
            numbers.put(num,newCout);

        }
        numbers.forEach((k,v) -> {
            System.out.printf("%.1f -> %d%n" ,k,v);
        });
    }
}
