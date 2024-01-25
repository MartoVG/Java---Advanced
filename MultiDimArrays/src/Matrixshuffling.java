import java.util.Scanner;

public class Matrixshuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimentions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimentions[0]);
        int cols = Integer.parseInt(dimentions[1]);
        String [][] matrix = new String[rows][cols];


        fillMatrix(matrix, scanner);

        String command = scanner.nextLine();

        while (!"End".equals(command)){
            String[] commandParst = command.split("\\s+");
            if (validateCommand(commandParst, rows, cols)) {
                int rowFirstEl = Integer.parseInt(commandParst[1]);
                int colFirstEl = Integer.parseInt(commandParst[2]);
                int rowSecondEl = Integer.parseInt(commandParst[3]);
                int colSecondEl = Integer.parseInt(commandParst[4]);


                String firstEl = matrix[rowFirstEl][colFirstEl];
                String secondEl = matrix[rowSecondEl][colSecondEl];

                //Shuffle
                matrix[rowFirstEl][colFirstEl] = secondEl;
                matrix[rowSecondEl][colSecondEl] = firstEl;

                printMatrix(matrix);
            }else{
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }

    }



    private static boolean validateCommand(String[] commandParst, int rows, int cols) {
        if (commandParst.length != 5){
            return false;
        }
        if (!"swap".equals(commandParst[0])){
            return false;
        }
            int rowFirstEl = Integer.parseInt(commandParst[1]);
            int colFirstEl = Integer.parseInt(commandParst[2]);
            int rowSecondEl = Integer.parseInt(commandParst[3]);
            int colSecondEl = Integer.parseInt(commandParst[4]);

        if (rowFirstEl >= 0 && rowFirstEl < rows && rowSecondEl >= 0 && rowSecondEl < rows &&
                colFirstEl >=0 && colFirstEl < cols && colSecondEl >= 0 && colSecondEl < cols){
                return  true;
        }
        else{
            return false;
        }
    }

    private static void printMatrix(String[][] matrix) {
        System.out.println();
        for(String[] row: matrix){

             for (String element : row){
                 System.out.print(element + " ");
             }
             System.out.println();
         }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
