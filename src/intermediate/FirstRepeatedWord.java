package intermediate;

import java.util.HashSet;

public class FirstRepeatedWord {
    public static String firstRepeatedWord(String sentence) {
        String[] words = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "").trim().split("\\s+");

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!set.add(word)) {
                return word + " (repeated at position: " + (i + 1) + ")";
            }
        }
        return "No repetition found.";
    }

    public static void main(String[] args) {
        System.out.println("First repetition word of sentence is: " +
                firstRepeatedWord("I love Java, and Love coding"));
    }
}
