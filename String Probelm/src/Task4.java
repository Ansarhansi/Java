public class Task4 {
    public static void main(String[] args) {
        String input = "you are welcome";
        StringBuilder output = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                char next = (char) (ch + 1);
                while ("aeiouAEIOU".indexOf(next) != -1) {
                    next++;
                }
                output.append(next);
            } else {
                output.append(ch);
            }
        }

        System.out.println("Output: " + output);
    }
}
