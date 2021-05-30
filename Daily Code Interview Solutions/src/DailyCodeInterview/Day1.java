package DailyCodeInterview;
import java.util.*;

// Given a list of numbers and a number k, return whether any two numbers from the list add up to k. eg arr=[10,15,3,7] k=17 return True

public class Day1 {

    static boolean sum (int arr[], int sum) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        System.out.println(sum(arr,sum));
    }
}
