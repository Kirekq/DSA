import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class I {
    public static String anagramCheck(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return "NO";
        }
        Map<Character, Integer> symbols = new HashMap<>();
        for (int i = 0; i < firstWord.length(); i++) {
            char c = firstWord.charAt(i);
            symbols.put(c, symbols.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < secondWord.length(); i++) {
            char c = secondWord.charAt(i);
            if (symbols.containsKey(c)) {
                symbols.put(c, symbols.getOrDefault(c, 0) - 1);
            } else {
                return "NO";
            }
        }
        for (int count : symbols.values()) {
            if (count != 0) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        System.out.println(anagramCheck(firstWord, secondWord));
    }
}
