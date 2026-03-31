interface SmartDeviceControl{
    void turnOn();
    void turnOff();
}

class Light implements SmartDeviceControl{
    public void turnOn(){
        System.out.println("Light ON");
    }
    public void turnOff(){
        System.out.println("Light OFF");
    }
}

class AC implements SmartDeviceControl{
    public void turnOn(){
        System.out.println("AC ON");
    }
    public void turnOff(){
        System.out.println("AC OFF");
    }
}

class TV implements SmartDeviceControl{
    public void turnOn(){
        System.out.println("TV ON");
    }
    public void turnOff(){
        System.out.println("TV OFF");
    }
}

public class SmartDevice{
    public static void main(String[] args){
        SmartDeviceControl d=new Light();
        d.turnOn();
        d.turnOff();
    }
}
