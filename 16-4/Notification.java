package internal;

public class Notification {
    private String type;
    private String message;

    public void setType(String type) { this.type = type; }
    public void setMessage(String message) { this.message = message; }

    public void alert() {
        System.out.println("[" + type + "] " + message);
    }

    public String toString() {
        return "Notification{type='" + type + "', message='" + message + "'}";
    }
}
