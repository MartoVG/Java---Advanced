import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(reader.readLine().split(",\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        List<Integer> evenNums = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNums.toString(). replaceAll("\\[|]", ""));

        Collections.sort(evenNums);
        System.out.println(evenNums.toString(). replaceAll("\\[|]", ""));
    }
}
