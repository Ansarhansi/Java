public class SimpleStringChecker {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide some strings as command-line arguments.");
            return;
        }

        
        String searchString = "Java";
        boolean isPresent = false;

        
        for (String arg : args) {
            if (arg.equals(searchString)) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("\"" + searchString + " is present in the command-line arguments.");
        } else {
            System.out.println("\"" + searchString + " is not present in the command-line arguments.");
        }
    }
}
