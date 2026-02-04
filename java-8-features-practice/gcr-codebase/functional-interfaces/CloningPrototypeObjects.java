class Product implements Cloneable{
    int id=1;
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloningPrototypeObjects{
    public static void main(String[] args)throws Exception{
        Product p1=new Product();
        Product p2=(Product)p1.clone();
        System.out.println("Cloned successfully");
    }
}
