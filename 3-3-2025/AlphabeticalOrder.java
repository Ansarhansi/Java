public class AlphabeticalOrder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide some strings as command-line arguments.");
            return;
        }


        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    // Swap args[i] and args[j]
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }

       
        System.out.println("Sorted strings in alphabetical order:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
