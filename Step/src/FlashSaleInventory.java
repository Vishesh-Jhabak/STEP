import java.util.*;

public class FlashSaleInventory {

    static HashMap<String, Integer> stock = new HashMap<>();
    static Queue<Integer> waitingList = new LinkedList<>();

    public static void purchase(String product, int userId) {
        int s = stock.getOrDefault(product, 0);

        if (s > 0) {
            stock.put(product, s - 1);
            System.out.println("Purchase success. Remaining: " + (s - 1));
        } else {
            waitingList.add(userId);
            System.out.println("Out of stock. Added to waiting list.");
        }
    }

    public static void main(String[] args) {
        stock.put("IPHONE15", 2);

        purchase("IPHONE15", 101);
        purchase("IPHONE15", 102);
        purchase("IPHONE15", 103);
    }
}