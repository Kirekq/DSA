import java.util.Scanner;
import java.util.Arrays;

public class I_search {
    private static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[] firstArr = new int[n];
        for (int i = 0; i < n; i++) {
            firstArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] secondArr = new int[m];
        for (int i = 0; i < m; i++) {
            secondArr[i] = sc.nextInt();
        }

        Arrays.sort(firstArr);

        for (int i = 0; i < m; i++) {
            int x = secondArr[i];
            int lb = lowerBound(firstArr, x);
            int ub = upperBound(firstArr, x);

            System.out.print((ub - lb) + " ");
        }
    }
}