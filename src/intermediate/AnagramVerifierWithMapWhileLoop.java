package intermediate;

public class AnagramVerifierWithMapWhileLoop {
    public static Boolean isAnagram(String s1, String s2){

        int s1length = s1.length();
        int s2length = s2.length();

        if(s1length != s2length){
            return false;
        }

        for (int i =0; i < s1length; i++){
        for(int j= s2length; j < s2length; j--)
        {
            if (s1.toCharArray().equals(s2.toCharArray().equals(j)));
        }
        return true;
        }
        return false;
    }

    public static void main(String[] args){
        String s1= "listen";
        String s2= "silent";

        System.out.println("Are they anagram? " + isAnagram(s1,s2));
    }
}
