public class NetworkUtils {
    public void ping(String ipAddress) {
        System.out.println("Pinging IP: " + ipAddress);
    }

    public void ping(String ipAddress, int packetSize) {
        System.out.println("Pinging IP: " + ipAddress + " with packet size: " + packetSize + " bytes");
    }
}
