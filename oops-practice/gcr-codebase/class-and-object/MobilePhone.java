class MobilePhone {
    String brand;
    String model;
    double price;
    public static void main(String[] args) {
        MobilePhone mp1 = new MobilePhone();
        mp1.brand = "VIVO";
        mp1.model = "VIVO V29";
        mp1.price = 15999.0;
        MobilePhone mp2 = new MobilePhone();
        mp2.brand = "ONE PLUS";
        mp2.model = "ONE PLUS nord4";
        mp2.price = 39999.0;
        MobilePhone mp3 = new MobilePhone();
        mp3.brand = "APPLE";
        mp3.model = "iphone pro16";
        mp3.price = 79999.0;

        mp1.display();
        mp2.display();
        mp3.display();
    }
    void display() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }
}
