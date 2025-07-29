package intermediate;

import java.util.HashMap;

public class FirstUniqueChar {
    public static char firstUniqueCharInAString(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for( char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }
        for(char c: str.toCharArray()){
            if (map.get(c) == 1){
                return c;
            }
        }
        return '-';
    }
    public static void main(String[] args){
        System.out.println("The first Unique Char in the string: " + firstUniqueCharInAString("leetcode"));
    }
}
