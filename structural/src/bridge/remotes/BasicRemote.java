package bridge.remotes;

import bridge.devices.Device;

/**
 * 基本的なリモコン
 */
public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() { }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getChannel() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getChannel() + 10);
    }

    @Override
    public void channelDown() {
        System.err.println("Remote: chennel down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.err.println("Remote: chennel up");
        device.setChannel(device.getChannel() + 1);
    }
}
