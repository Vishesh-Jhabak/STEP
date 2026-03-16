import java.util.*;

class DNSEntry {
    String ip;
    long expiry;

    DNSEntry(String ip, int ttl) {
        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttl * 1000;
    }
}

public class DNSCache {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, DNSEntry> cache = new HashMap<>();

        System.out.print("Enter domain name: ");
        String domain = sc.nextLine();

        DNSEntry entry = cache.get(domain);

        if (entry != null && System.currentTimeMillis() < entry.expiry) {
            System.out.println("Cache HIT: " + entry.ip);
        } else {
            String newIp = "172.217.14.206";
            cache.put(domain, new DNSEntry(newIp, 300));
            System.out.println("Cache MISS. IP: " + newIp);
        }

        sc.close();
    }
}