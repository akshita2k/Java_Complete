package DailyCodeInterview;
import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int [n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();



        int res[] = new int [n];

        for (int i=0; i<n; i++) {
            int prod =1;
            for (int j=0; j<n; j++) {
               if (j!=i) {
                    prod = arr[j] * prod;
                }
            }
            res[i] = prod;
        }

        for (int i=0; i<n; i++) {
            System.out.println(res[i]);
        }
    }
}
