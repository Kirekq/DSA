
import java.util.ArrayList;
import java.util.Scanner;

public class J {
    public static void compare(ArrayList<String> arr) {
        int n = arr.toArray().length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if ((arr.get(j) + arr.get(j+1)).compareTo(arr.get(j+1) + arr.get(j)) < 0){
                    String temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();

            if (!s.isEmpty()) {
                arr.add(s);
            }
        }
        compare(arr);
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }
        System.out.println(answer);
    }
}
