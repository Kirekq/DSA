import java.util.Arrays;
import java.util.Scanner;

public class L {
    public static long theLowestPrice (int[] distance, int[] tariffs) {
        long totalSum = 0;
        Arrays.sort(distance);
        Arrays.sort(tariffs);
        for (int i = 0; i < distance.length; i++) {
            totalSum += (long) distance[i] * tariffs[tariffs.length - 1 - i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        String d = scanner.nextLine();
        String t = scanner.nextLine();
        String[] distanceString = d.split("\\s+");
        String[] tariffsString = t.split("\\s+");
        int[] distance = new int[distanceString.length];
        int[] tariffs = new int[tariffsString.length];
        for (int i = 0; i < distanceString.length; i++) {
            distance[i] = Integer.parseInt(distanceString[i]);
            tariffs[i] = Integer.parseInt(tariffsString[i]);
        }
        System.out.println(theLowestPrice(distance, tariffs));
    }
}
