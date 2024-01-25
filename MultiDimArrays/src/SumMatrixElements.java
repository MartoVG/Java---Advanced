import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //FAIL
        Scanner sizes = scanner;
        int[][] matrix = new int[][]{readInputAsArray(sizes)};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
    }
    public static int[] readInputAsArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
