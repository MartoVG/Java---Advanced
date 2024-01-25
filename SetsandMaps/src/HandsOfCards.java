import java.util.Scanner;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String someString = "elephant";
        long count = someString.chars().filter(ch -> ch == 'e').count();
       // a(2, count);

        long count2 = someString.codePoints().filter(ch -> ch == 'e').count();
        //assertEquals(2, count2);
    }
}
