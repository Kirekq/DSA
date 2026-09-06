import java.util.Scanner;

public class K {

    public static int[] createWorstArray(int n) {
        int[] arr = new int[n];
        if (n >= 1) {
            arr[0] = 1;
        }
        if (n >= 2) {
            arr[1] = 2;
        }
        for (int i = 3; i <= n; i++) {
            arr[i - 1] = i;
            int mid = (i - 1) / 2;
            int temp = arr[mid];
            arr[mid] = arr[i - 1];
            arr[i - 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = createWorstArray(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}