import java.util.Scanner;

public class D {
    public static int BubbleSort(int[] arr, int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                    cnt += 1;
                }
            }
            if (!flag) {
                break;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        int length = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        String[] strNums = line.split("\\s+");
        int[] arr = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            arr[i] = Integer.parseInt(strNums[i]);
        }
        System.out.println(BubbleSort(arr, length));
    }
}
