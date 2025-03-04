package smartHome;

import java.util.ArrayList;
import java.util.List;

class SmartHome {
    private List<SmartDev> devices;

    public SmartHome() {
        devices = new ArrayList<>();
    }

    public void addDevice(SmartDev device) {
        devices.add(device);
    }

    public void removeDevice(String deviceID) {
        devices.removeIf(device -> device.deviceID.equals(deviceID));
    }

    public void notifyOwner(String message) {
        System.out.println("NOTIFICATION: " + message);
    }

    public void getStatus() {
        for (SmartDev device : devices) {
            System.out.println(device.name + " is " + (device.getStatus() ? "ON" : "OFF"));
        }
    }
}
