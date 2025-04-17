package internal;

class VideoConferenceSystem extends CommunicationDevice {
    @Override
    public void transmit() {
        System.out.println("Video conference system is transmitting video and audio.");
    }
    public void shareScreen() {
        System.out.println("Video conference system is sharing screen.");
    }
}