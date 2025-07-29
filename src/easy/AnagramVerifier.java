package easy;

import java.util.Arrays;

public class AnagramVerifier {
    public static Boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args){
        System.out.println("Are these strings anagram? " + isAnagram("listen", "silent"));
    }
}
