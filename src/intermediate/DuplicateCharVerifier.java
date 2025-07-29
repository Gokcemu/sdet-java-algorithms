package intermediate;

import java.util.HashSet;

public class DuplicateCharVerifier {
    public static boolean hasDuplicate(String str){
        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray()){
            if(!set.add(c)){
                return true; // already include, duplicates
            }
        }
        return false; // no duplicate
    }

    public static void main(String[] args){
        System.out.println("String has duplicate values " + hasDuplicate("abcdefg"));
        System.out.println("String has duplicate values " + hasDuplicate("apple"));
    }
}
