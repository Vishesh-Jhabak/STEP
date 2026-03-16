import java.util.*;

public class PlagiarismDetector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Set<String>> map = new HashMap<>();

        System.out.println("Enter document text:");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 2; i++) {

            String gram = words[i] + " " + words[i + 1] + " " + words[i + 2];

            map.putIfAbsent(gram, new HashSet<>());
            map.get(gram).add("doc1");
        }

        System.out.println("Generated n-grams:");
        System.out.println(map);

        sc.close();
    }
}