import java.util.*;

public class UsernameChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> users = new HashMap<>();
        HashMap<String, Integer> attempts = new HashMap<>();

        users.put("john_doe", 1); // existing user

        System.out.print("Enter username to check: ");
        String username = sc.nextLine();

        attempts.put(username, attempts.getOrDefault(username, 0) + 1);

        if (users.containsKey(username)) {
            System.out.println("Username already taken.");

            System.out.println("Suggestions:");
            System.out.println(username + "1");
            System.out.println(username + "2");
            System.out.println(username.replace("_", "."));
        } else {
            System.out.println("Username available.");
        }

        sc.close();
    }
}