import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[]tokens = scanner.nextLine().split("\\s+");
        int nFisrtSet = Integer.parseInt(tokens[0]);
        int mSecondSet = Integer.parseInt(tokens[1]);

        Set<String> firstSet = new LinkedHashSet<>();

        for (int i = 0; i < nFisrtSet ; i++) {
            firstSet.add(scanner.nextLine());
        }
        Set<String> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < mSecondSet ; i++) {
            secondSet.add(scanner.nextLine());
        }

        if(firstSet.size() >= secondSet.size()){
            for (String s : firstSet) {
                if (secondSet.contains(s)){
                    System.out.print(s + " ");
                }
            }
        }else{
            for (String s : secondSet) {
                if (firstSet.contains(s)){
                    System.out.print(s + " ");
                }
            }
        }
    }
}
