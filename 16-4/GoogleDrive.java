package internal;

class GoogleDrive extends Cloud {
    @Override
    public void store() {
        System.out.println("Storing data in Google Drive.");
    }

    public void sync() {
        System.out.println("Syncing files.");
    }
}