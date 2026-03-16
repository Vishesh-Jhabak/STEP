import java.util.*;

public class MultiLevelCache {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, String> L1 = new LinkedHashMap<>(5, 0.75f, true);
        HashMap<String, String> L2 = new HashMap<>();

        System.out.print("Enter video ID: ");
        String id = sc.nextLine();

        if (L1.containsKey(id)) {
            System.out.println("L1 Cache HIT");
        }
        else if (L2.containsKey(id)) {
            L1.put(id, L2.get(id));
            System.out.println("L2 Cache HIT (Promoted to L1)");
        }
        else {
            String data = "VideoData";
            L2.put(id, data);
            System.out.println("Database HIT");
        }

        sc.close();
    }
}
