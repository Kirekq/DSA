import java.util.Scanner;

public class E {
    public static boolean check(int dist, int[] stalls, int k) {
        int count = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= dist) {
                count++;
                lastPosition = stalls[i];
            }
        }
        return count >= k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] stalls = new int[n];
        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }

        int left = 1;
        int right = stalls[n - 1] - stalls[0];
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (check(mid, stalls, k)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
