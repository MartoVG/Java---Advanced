import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guest = scanner.nextLine();
        Set<String> regular = new TreeSet<>();
        Set<String> vip = new TreeSet<>();
        while (!"PARTY".equals(guest)) {
            if (Character.isDigit(guest.charAt(0))){
                vip.add(guest);
            }
            else{
                regular.add(guest);
            }


            guest = scanner.nextLine();
        }
        while (!"END".equals(guest)){
            vip.remove(guest);
            regular.remove(guest);

            guest = scanner.nextLine();
        }
        System.out.println(vip.size()+ regular.size());
        for (String vipGuest : vip) {
            System.out.println(vipGuest);
        }
        for (String regularGuest : regular) {
            System.out.println(regularGuest);
        }
    }
}
