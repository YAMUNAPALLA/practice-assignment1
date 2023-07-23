import java.util.*;

public class java1Darray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Create an array of size n
        int[] a = new int[n];

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }


        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}