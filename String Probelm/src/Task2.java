public class Task2 {
    public static void main(String[] args) {
        String sentence = "rcb will win the match against csk";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.print(word.length() + " ");
        }
    }
}
