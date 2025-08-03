package easy;

public class ReverseAStringWithStringBuilder {
    public static String reverseAString(String str) {
        StringBuilder reversedText = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedText.append(str.charAt(i));
        }
        return reversedText.toString();
    }
    public static void main(String[] args){
        System.out.println("The reversed of the text is: " + reverseAString("Gokcem"));
    }
}
