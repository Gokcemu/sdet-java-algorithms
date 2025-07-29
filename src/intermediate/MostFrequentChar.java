package intermediate;

import java.util.HashMap;

public class MostFrequentChar {
    public static char mostFrequentChar(String str) {

        int maxCount = 0;
        char maxChar = '-';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) > maxCount) {
                maxCount = map.get(c);
                maxChar = c;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println("Most frequent char in the String: " + mostFrequentChar("banana"));
    }
}
