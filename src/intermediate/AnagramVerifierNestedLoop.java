package intermediate;

public class AnagramVerifierNestedLoop {
    public static boolean isAnagramUsingStringBuilder(String s1, String s2) {
        // Fast Fail // Check the length of the texts
        if (s1.length() != s2.length()) {
            return false;
        }
        // Convert 2. text to string builder
        StringBuilder sb2 = new StringBuilder(s2);

        // OUTER LOOP // Check all letters in the first string
        for (int i = 0; i < s1.length(); i++) {
            char charToFind = s1.charAt(i);
            boolean found = false;

            // INNER LOOP // Check all letters in second string and verify if they match
            for (int j = 0; j < sb2.length(); j++) {
                if (sb2.charAt(j) == charToFind) {
                    sb2.deleteCharAt(j);
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramUsingStringBuilder("listen", "silent")); // true
        System.out.println(isAnagramUsingStringBuilder("rat", "car"));       // false
        System.out.println(isAnagramUsingStringBuilder("hello", "billion")); // false
        System.out.println(isAnagramUsingStringBuilder("aab", "abc")); // false
    }
}
