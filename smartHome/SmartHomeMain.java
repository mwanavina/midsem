package smartHome;

public class SmartHomeMain {
    public static void main(String[] args) {
        User user = new User();
        SmartLight light = new SmartLight("L1", "Living Room Light");
        SmartThermostat thermostat = new SmartThermostat("T1", "Home Thermostat");
        SmartCam camera = new SmartCam("C1", "Backyard Camera");
        SmartSecSys securitySystem = new SmartSecSys("S1", "Home Security");

        user.addDeviceToHome(light);
        user.addDeviceToHome(thermostat);
        user.addDeviceToHome(camera);
        user.addDeviceToHome(securitySystem);

        user.turnDeviceOn(light);
        user.turnDeviceOn(camera);
        user.armSecuritySystem(securitySystem);

        try {
            thermostat.setTemperature(50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        thermostat.setTemperature(20);

        camera.detectMotion();
        securitySystem.armSystem();
    }

    public void getStatus() {
    }

    public void addDevice(SmartDev device) {
    }
}
