import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter transaction amounts:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target amount: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + complement + " + " + arr[i]);
            }

            map.put(arr[i], i);
        }

        sc.close();
    }
}