public class PalindromeString {
    public static void main(String[] args) {
        String str = "radar"; 
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray(); 
        int start = 0;
        int end = chars.length - 1;

        
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false; 
            }
            start++;
            end--;
        }

        return true; 
    }
}
