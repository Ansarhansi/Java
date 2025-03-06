public class UppercaseConverter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide some strings as command-line arguments.");
            return;
        }

       
        System.out.println("Strings converted to uppercase:");
        for (String arg : args) {
            System.out.println(arg.toUpperCase());
        }
    }
}
