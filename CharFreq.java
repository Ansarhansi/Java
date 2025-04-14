public class CharFreq {
    public static void main(String[] args) {
        
        String S = "Hi myself Ansar iam fine how are you";
        int[] f = new int[256]; 
        for (int i = 0; i < S.length(); i++) {
            f[S.charAt(i)]++;
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] > 0 && Character.isLetterOrDigit((char) i)) {
                System.out.println((char) i + ": " + f[i]);
            }
        }
    }
}