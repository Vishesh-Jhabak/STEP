import java.util.*;

public class WebsiteAnalytics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> pageViews = new HashMap<>();
        HashMap<String, Set<String>> uniqueUsers = new HashMap<>();
        HashMap<String, Integer> sourceCount = new HashMap<>();

        System.out.print("Enter page URL: ");
        String url = sc.nextLine();

        System.out.print("Enter user ID: ");
        String user = sc.nextLine();

        System.out.print("Enter traffic source: ");
        String source = sc.nextLine();

        pageViews.put(url, pageViews.getOrDefault(url, 0) + 1);

        uniqueUsers.putIfAbsent(url, new HashSet<>());
        uniqueUsers.get(url).add(user);

        sourceCount.put(source, sourceCount.getOrDefault(source, 0) + 1);

        System.out.println("Page Views: " + pageViews);
        System.out.println("Unique Users: " + uniqueUsers);
        System.out.println("Traffic Sources: " + sourceCount);

        sc.close();
    }
}