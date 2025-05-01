public class Task3 {
    public static void main(String[] args) {
        String sentence = "Today is my day, I will do best";
        int vowels = 0, consonants = 0;
        sentence = sentence.toLowerCase();

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
