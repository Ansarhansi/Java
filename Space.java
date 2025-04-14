public class Space {
    public static void main(String[] args) {
       
        String S = "Hi myself Ansar iam fine how are you";
        int spaceCount = 0 ;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Number of spaces: " + spaceCount);
    }
}
