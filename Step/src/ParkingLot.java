import java.util.*;

public class ParkingLot {

    static String[] table = new String[10];

    static int hash(String plate) {
        return Math.abs(plate.hashCode()) % table.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle license plate: ");
        String plate = sc.nextLine();

        int index = hash(plate);

        while (table[index] != null) {
            index = (index + 1) % table.length;
        }

        table[index] = plate;

        System.out.println("Vehicle parked at spot: " + index);

        sc.close();
    }
}