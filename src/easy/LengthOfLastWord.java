package easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String sentence){
        System.out.println("The sentence: " + sentence);

        if (sentence == null || sentence.trim().isEmpty()){
            System.out.println("Input entry in null");
            return 0;
        }
        sentence = sentence.trim();
        int lengthOfLastWord = 0;
        int i= sentence.length() -1;  // index of last char (after trim)

        while (i>=0 && sentence.charAt(i) != ' '){
            System.out.println("Current char: " + sentence.charAt(i));
            i--;
            lengthOfLastWord ++;

        }
        System.out.println("The length of last word: " + lengthOfLastWord);
        return lengthOfLastWord;
    }

    public  static void main(String args[]){
        lengthOfLastWord("Fly to the moon ");
        lengthOfLastWord("Gokcem ");
        lengthOfLastWord("Gokcem Usul");
        lengthOfLastWord("  ");
    }
}
