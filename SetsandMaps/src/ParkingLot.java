import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();
        while (!"END".equals(command)){
            String[]input = command.split(",\\s+");
            if("IN".equals(input[0])){
                parkingLot.add(input[1]);
            } else if ("OUT".equals(input[0])){
                parkingLot.remove(input[1]);
            }

            command = scanner.nextLine();
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");}


        for (String carNumber : parkingLot) {
            System.out.println(carNumber);
        }

    }
}
