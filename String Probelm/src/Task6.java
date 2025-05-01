public class Task6 {
    public static void main(String[] args) {
        String input = "hello how are you all set to go home";
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                output.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        System.out.println("Output: " + output.toString().trim());
    }
}
