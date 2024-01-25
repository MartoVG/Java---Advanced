import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]dimensionFirst = readInputAsArray(scanner);
        int firstRows = dimensionFirst[0];
        int firstCols = dimensionFirst[1];

        int[][] firstArray = new int[firstRows][firstCols];

        for (int row = 0; row < firstRows; row++) {
            firstArray[row]= readInputAsArray(scanner);
        }



        int[]dimensionSecond= readInputAsArray(scanner);

        int secondRows = dimensionSecond[0];
        int secondCols = dimensionSecond[1];

        int[][] secondArray = new int[secondRows][secondCols];

        for (int row = 0; row < secondRows; row++) {
            secondArray[row]= readInputAsArray(scanner);
        }



        if (!areEqual(dimensionSecond,dimensionFirst)){
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i < firstRows; i++) {
            if (!areEqual(firstArray[i],secondArray[i])){
                System.out.println("not equal");
                return;
            }

        }
        System.out.println("equal");
    }
    public static boolean areEqual(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) return false;
        boolean areEqual = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                areEqual = false;
                break;
            }
        }

        return areEqual;
    }




    public static int[] readInputAsArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
