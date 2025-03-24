 public class LoginEmail {
    static String[] loginEmails = {null, null, null, null};
    static int index = 0;

    public static void displayEmails() {
        System.out.println("Saved login emails:");
        for (String email : loginEmails) {
            if (email != null) {
                System.out.println(email);
            }
        }
    }

    public static boolean searchEmail(String email) {
        for (int i = 0; i < index; i++) {
            if (loginEmails[i] != null && loginEmails[i].equalsIgnoreCase(email)) {
                System.out.println("Email found: " + email);
                return true;
            }
        }
        return false;
    }

    public static void saveEmail(String email) {
        if (loginEmails != null) {
            if (searchEmail(email)) {
                System.out.println("Email already exists: " + email);
            } else if (index < loginEmails.length) {
                loginEmails[index] = email;
                index++;
                System.out.println("Email saved successfully: " + email);
            } else {
                System.out.println("Email list is full, cannot save: " + email);
            }
        } else {
            System.out.println("Email storage is not initialized.");
        }
    }
}