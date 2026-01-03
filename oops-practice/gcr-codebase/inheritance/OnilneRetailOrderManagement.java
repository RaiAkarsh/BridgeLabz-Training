class Order{
    int orderId;
    int orderDate;
    public Order(int orderId, int orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    void getOrderStatus(){
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate);
    }
}
class ShippedOrder extends Order{
    int trackingNumber;
    public ShippedOrder(int orderId, int orderDate,int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    public DeliveredOrder(int orderId, int orderDate, int trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
public class OnilneRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, 20230915, 555123, "2023-09-20");
        order.getOrderStatus();
    }   
}
