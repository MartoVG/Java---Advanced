import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumbersWAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = (scanner.nextLine().split("\\s+"));

        Deque<Integer> stackNumbers = new ArrayDeque<>();
        //Adding
        for (String el : input) {
            int number = Integer.parseInt(el);
            stackNumbers.push(number);
        }


        //Removing
        while (!stackNumbers.isEmpty()){

            System.out.print(stackNumbers.pop() + " ");
        }
    }
}
