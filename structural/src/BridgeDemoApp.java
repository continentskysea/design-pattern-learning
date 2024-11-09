import bridge.devices.Device;
import bridge.devices.Radio;
import bridge.devices.Tv;
import bridge.remotes.AdvancedRemote;
import bridge.remotes.BasicRemote;

public class BridgeDemoApp {
    public static void main(String[] args) {
        System.out.println("Bridgeパターン");
        testDevice(new Tv());
        testDevice(new Radio());
        
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
