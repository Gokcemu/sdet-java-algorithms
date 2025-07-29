package intermediate;

import java.util.HashMap;

public class LeastFrequentChar {
    public static char leastFrequentChar(String str) {

        int minCount = Integer.MAX_VALUE;
        char minChar = '-';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) < minCount) {
                minCount = map.get(c);
                minChar = c;
            }
        }
        return minChar;
    }

    public static void main(String[] args) {
        System.out.println("Most frequent char in the String: " + leastFrequentChar("banana"));
    }
}
