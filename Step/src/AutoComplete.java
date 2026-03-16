import java.util.*;

public class AutoComplete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> queries = new HashMap<>();

        System.out.print("Enter number of queries stored: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String q = sc.nextLine();
            queries.put(q, queries.getOrDefault(q, 0) + 1);
        }

        System.out.print("Enter prefix to search: ");
        String prefix = sc.nextLine();

        System.out.println("Suggestions:");

        for (String q : queries.keySet()) {
            if (q.startsWith(prefix)) {
                System.out.println(q + " (" + queries.get(q) + ")");
            }
        }

        sc.close();
    }
}