import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Set<String> parkingLot = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            String input = sc.nextLine();

            if (input.equals("END")) {

                break;

            } else {

                String[] reminder = input.split(", ");

                if (reminder[0].equals("IN")) {

                    parkingLot.add(reminder[1]);

                } else {

                    parkingLot.remove(reminder[1]);
                }
            }

        }

    }
}
