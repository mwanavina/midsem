package smartHome;

class User {
    private SmartHomeMain home;

    public User() {
        this.home = new SmartHomeMain();
    }

    public void addDeviceToHome(SmartDev device) {
        home.addDevice(device);
    }

    public void turnDeviceOn(SmartDev device) {
        device.turnOn();
    }

    public void turnDeviceOff(SmartDev device) {
        device.turnOff();
    }

    public void armSecuritySystem(SmartSecSys securitySystem) {
        securitySystem.armSystem();
    }

    public void disarmSecuritySystem(SmartSecSys securitySystem) {
        securitySystem.disarmSystem();
    }

    public void viewAllDeviceStatus() {
        home.getStatus();
    }
}
