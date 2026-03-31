class Device{
    int deviceId;
    String status;
    public Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus(){
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}
class Thermostat extends Device{
    int temperatureSetting;
    public Thermostat(int deviceId, String status, int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    public void displayStatus(){
        System.out.println("Thermostat Details:");
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Thermostat(1, "ON", 72);
        device.displayStatus();
    }
    
}
