import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Phaser;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]dimension = readInputAsArray(scanner);

        int[][] matrix = new int[dimension[0]][dimension[1]];

        for (int i = 0; i < dimension[0]; i++) {
            matrix[i] = readInputAsArray(scanner);
        }

        int number = Integer.parseInt(scanner.nextLine());
        boolean haxFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number){
                    System.out.printf("%d %d%n",row,col);
                    haxFound = true;
                }
            }
        }

        if (!haxFound){
            System.out.println("not found");
        }
    }
    public static int[] readInputAsArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
