import java.util.Scanner;

public class G {
    public static boolean check(int l, int[] ropes, int k) {
        if (l == 0) return true;

        int count = 0;
        for (int rope : ropes) {
            count += rope / l;
        }
        return count >= k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] ropes = new int[n];
        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        int left = 0;
        int right = 10000000;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (check(mid, ropes, k)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(ans);
    }
}