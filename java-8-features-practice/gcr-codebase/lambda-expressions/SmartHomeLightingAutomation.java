interface LightAction{
    void activate();
}

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {
        LightAction motonTrigger = () -> System.out.println("Light on at full brightness");
        LightAction nightTrigger = () -> System.out.println("Light on in dim mode");
        LightAction voiceTrigger = () -> System.out.println("Light toggled via voice command");

        motonTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}