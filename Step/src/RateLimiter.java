import java.util.*;

class TokenBucket {
    int tokens = 5;
}

public class RateLimiter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, TokenBucket> map = new HashMap<>();

        System.out.print("Enter client ID: ");
        String client = sc.nextLine();

        map.putIfAbsent(client, new TokenBucket());

        TokenBucket bucket = map.get(client);

        if (bucket.tokens > 0) {
            bucket.tokens--;
            System.out.println("Request Allowed. Remaining tokens: " + bucket.tokens);
        } else {
            System.out.println("Rate limit exceeded.");
        }

        sc.close();
    }
}