import java.util.Scanner;

public class H {
    public static boolean check(long mid, long w, long h, long n) {
        long countW = mid / w;
        long countH = mid / h;
        return countW * countH >= n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) return;

        long w = sc.nextLong();
        long h = sc.nextLong();
        long n = sc.nextLong();

        long left = 1;
        long right = Math.max(w, h) * n;
        long dim = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (check(mid, w, h, n)) {
                dim = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(dim);
    }
}