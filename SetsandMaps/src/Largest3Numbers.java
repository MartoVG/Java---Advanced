import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // given
        List<Integer> listOfIntegers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).toList();


        // then
        //

        Integer maxNum = Collections.max(listOfIntegers);

        System.out.println(maxNum);
        listOfIntegers.remove(maxNum);
        for (Integer listOfInteger : listOfIntegers) {
            System.out.println(listOfInteger);

        }
    }
}
