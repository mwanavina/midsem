package smartHome;

class SmartSecSys extends SmartDev {
    private boolean armed;

    public SmartSecSys(String deviceID, String name) {
        super(deviceID, name);
        this.armed = false;
    }

    public void armSystem() {
        armed = true;
        System.out.println("Security system armed.");
    }

    public void disarmSystem() {
        armed = false;
        System.out.println("Security system disarmed.");
    }
}
