package easy;

// Given a sentence, reverse each word individually, but keep the word order intact.

public class ReverseWordsInASentence {
    public static String reverseWordsInASentence(String sentence){
        // Split sentence into words
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(String word : words)
        {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse());
            reversedSentence.append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static void main(String[] args){
        System.out.println("The Reversed Sentence is: " + reverseWordsInASentence("You are a great coder"));
    }
}
