package internal;

class DeliveryService extends Service {
    @Override
    public void describe() {
        System.out.println("This is a Delivery Service.");
    }
    public void deliverParcel() {
        System.out.println("Delivering parcel to customer.");
    }
}
