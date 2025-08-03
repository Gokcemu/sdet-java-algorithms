package easy;

public class ReverseAString {
    public static String reverseString(String str) {
        String reversedText = "";
        char[] strArray = str.toCharArray();
        for (int i= str.length()-1 ; i >= 0 ; i--){
            reversedText += strArray[i];
        }
        return reversedText;
    }

    public static void main(String[] args){
        System.out.println("The reversed of string is: " + reverseString("Gokcem"));
    }
}
