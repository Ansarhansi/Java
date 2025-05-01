public class Task1 {
    public static void main(String[] args) {
        String sentence = "RCB will win the match";
        String[] words = sentence.split(" ");

        // Reverse words[2] and words[3] manually without using StringBuilder
        words[2] = reverseString(words[2]);
        words[3] = reverseString(words[3]);

        // Print the sentence
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    // Method to reverse a string without using StringBuilder
    public static String reverseString(String word) {
        char[] chars = word.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start < end) {
            // Swap characters
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
