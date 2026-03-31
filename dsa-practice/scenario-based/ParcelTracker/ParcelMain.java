public class ParcelMain {
    public static void main(String[] args) {

        ParcelLogic parcel = new ParcelLogic();

        parcel.addStage("Packed");
        parcel.addStage("Shipped");
        parcel.addStage("Delivered");

        parcel.addAfter("Shipped", "In Transit");
        parcel.track();

        parcel.deleteStage("Delivered");
        parcel.track();

        parcel.markLost();
        parcel.track();
    }
}
