public class LoginEmailRunner {
    public static void main(String[] args) {
        LoginEmail.saveEmail("ansar12@gmail.com");
        LoginEmail.saveEmail("kiranp13@gmail.com");
        LoginEmail.saveEmail("ansar12@gmail.com");  
        LoginEmail.saveEmail("manojH42@gmail.com");
        LoginEmail.saveEmail("TarunK@gmail.com");
        LoginEmail.saveEmail("Venky34@gmail.com");  

        LoginEmail.displayEmails();

        boolean found = LoginEmail.searchEmail("ansar12@gmail.com");
        System.out.println("Search result: " + found);
    }
}