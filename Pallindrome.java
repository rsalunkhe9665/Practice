package Practice;
import java.util.Scanner;

public class Pallindrome {
    public static boolean isPalindrome(int[] arr, int left, int right) {
        if(left>=right) {
            return true;
        }

        if(arr[left]!=arr[right]) {
            return false;
        }

        return isPalindrome(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result  = isPalindrome(arr, 0, n-1);

        if(result) {
            System.out.println("The array is palindrome");
        } else {
            System.out.println("The array is not palindrome");
        }
    }
}
