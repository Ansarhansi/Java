public class WordFrequency {
    public static void main(String[] args) {
       
        String S = "Hi myself Ansar iam fine how are you";

        String[] words = S.split(" ");

        System.out.println("Word frequencies:");
        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                continue; // Skip empty words
            }

            int count = 1; 
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++; 
                    words[j] = ""; 
                }
            }
            System.out.println(words[i] + ": " + count);
        }
    }
}