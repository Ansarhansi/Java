public class PaliCheck {
    public static void main(String[] args) {
       
        String S = "madam"; 

        S = S.toLowerCase();
        String reversedString = "";
       
        for (int i = S.length() - 1; i >= 0; i--) {
            reversedString += S.charAt(i);
        }

        if (S.equals(reversedString)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}