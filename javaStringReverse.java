import java.util.*;

public class javaStringReverse {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String A=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            boolean palindrome = isPalindrome(A);

            if (palindrome) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
    }
}



