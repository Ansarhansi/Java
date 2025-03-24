public class StringManipulator {
    public String concatenate(String a, String b) {
        return a + b;
    }

    public String concatenate(String a, String b, String c) {
        return a + b + c;
    }

    public int getLength(String str) {
        return str.length();
    }

    public void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
