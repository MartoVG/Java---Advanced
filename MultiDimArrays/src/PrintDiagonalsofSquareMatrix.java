import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int [size][size];

        int[][] res = new int [2][size];


        for (int row = 0; row < size; row++) {
            arr[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int col = 0;
        int bottomLeftTopRight = size -1;
        int topLeftBottomRight= 0;

        for (int i = 0; i < size; i++) {
            res[0][col] = arr[topLeftBottomRight][col];
            res[1][col]= arr[bottomLeftTopRight][col];
            col++;
            bottomLeftTopRight--;
            topLeftBottomRight++;
        }
        printMultiDimArray(res);
    }
    public  static void  printMultiDimArray(int[][] array){
        for (int row = 0; row < array.length; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < array[row].length; col++) {
                sb.append(array[row][col]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

}
