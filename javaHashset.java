import java.util.*;

public class javaHashset {

 public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];
            
            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }

//Write your code here
// Use a HashSet to store unique pairs
            Set<String> uniquePairs = new HashSet<>();
            for (int i = 0; i < t; i++) {
                String pair = pair_left[i] + " " + pair_right[i];
                uniquePairs.add(pair);
                System.out.println(uniquePairs.size()); // Output the current number of unique pairs
            }
        }

    }
}