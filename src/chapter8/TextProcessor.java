package chapter8;


public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love test automation university");
        reverseString("I love test automation university");
        addSpace("HelloWorld!It'sMe,Menna");
    }

    /**
     * Count words.
     * a method to tokenize the sentence into separate words
     * @param text the to be printed and counted
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);

        System.out.println(message);
        for (String word: words) {
            System.out.println(word);
        }
    }

    /**
     * Reverse string.
     * a method to reverse a text
     * @param text the text to be reversed
     */
    public static void reverseString(String text) {
        String reveresedString = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reveresedString = reveresedString.concat(String.valueOf(text.charAt(i)));
        }

        System.out.println("Reversed string is: " + reveresedString);
    }

    /**
     * Add space.
     * a method to add space before upper case letters
     * @param text the text to be modified
     */
    public static void addSpace(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i!= 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        String message = String.format("Your modified text is: %s", modifiedText);
        System.out.println(message);
    }
}