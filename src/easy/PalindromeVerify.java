package easy;

public class PalindromeVerify {
     public static String palindromeVerify(String palindrome){
         // Clean original text
         String cleanedOriginalText = palindrome.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
         String reversedText = "";

         // Build reversed version from the cleaned one
         for(int i = cleanedOriginalText.length() - 1; i>=0 ; i--){
             reversedText += cleanedOriginalText.charAt(i);
         }
         if(cleanedOriginalText.equals(reversedText)) {
             return palindrome + " is a palindrome";
         }
         else {
             return palindrome + " is not a palindrome";
         }
     }
         public static void main(String args[]){
          System.out.println(palindromeVerify("madam"));
          System.out.println(palindromeVerify("gokcem"));
          System.out.println(palindromeVerify("A man, a plan, a canal: Panama"));
         }
 }
