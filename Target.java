public class Target {
    public static void main(String[] args) {
        
        String sentence = "This is a sample sentence for testing.";
        String targetWord = "sample";

        
        if (sentence.contains(targetWord)) {
            System.out.println("The target word is present in the sentence.");
        } else {
            System.out.println("The target word is NOT present in the sentence.");
        }
    }
}
