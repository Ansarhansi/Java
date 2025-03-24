public class PasswordManager {
    public boolean validatePassword(String password) {
        return password.length() >= 8;
    }

    public boolean validatePassword(String password, boolean requireSpecialChar) {
        if (requireSpecialChar) {
            return password.matches(".*[!@#$%^&*].*");
        } else {
            return validatePassword(password);
        }
    }
}
