import java.util.*;

public class UsernameChecker {

    static HashMap<String, Integer> users = new HashMap<>();
    static HashMap<String, Integer> attempts = new HashMap<>();

    public static boolean checkAvailability(String username) {
        attempts.put(username, attempts.getOrDefault(username, 0) + 1);
        return !users.containsKey(username);
    }

    public static List<String> suggestAlternatives(String username) {
        List<String> list = new ArrayList<>();
        list.add(username + "1");
        list.add(username + "2");
        list.add(username.replace("_", "."));
        return list;
    }

    public static String getMostAttempted() {
        int max = 0;
        String result = "";
        for (String u : attempts.keySet()) {
            if (attempts.get(u) > max) {
                max = attempts.get(u);
                result = u;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        users.put("john_doe", 1);

        System.out.println(checkAvailability("john_doe"));
        System.out.println(checkAvailability("jane_smith"));
        System.out.println(suggestAlternatives("john_doe"));
    }
}