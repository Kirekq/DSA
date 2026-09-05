import java.util.Scanner;

public class A {
    public static int[] SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[maxIdx] < arr[j]) {
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;

        // ВВОД
        String line = scanner.nextLine();
        String[] strNums = line.split("\\s+");
        int[] arr = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            arr[i] = Integer.parseInt(strNums[i]);
        }

        SelectionSort(arr);

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}