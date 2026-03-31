interface PaymentProcessor{
    void pay(double amount);

    default void refund(double amount){
        System.out.println("Refund "+amount);
    }
}
class CreditCardProcessor implements PaymentProcessor{
    public void pay(double amount){
        System.out.println("Paid "+amount);
    }
}
public class PaymentGatewayIntegration{
    public static void main(String[] args){
        PaymentProcessor p=new CreditCardProcessor();
        p.pay(1000);
        p.refund(200);
    }
}
