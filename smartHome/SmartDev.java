package smartHome;

abstract class SmartDev {
    protected String deviceID;
    protected String name;
    protected boolean powerState;

    public SmartDev(String deviceID, String name) {
        this.deviceID = deviceID;
        this.name = name;
        this.powerState = false;
    }

    public void turnOn() {
        powerState = true;
        System.out.println(name + " is turned ON.");
    }

    public void turnOff() {
        powerState = false;
        System.out.println(name + " is turned OFF.");
    }

    public boolean getStatus() {
        return powerState;
    }
}
