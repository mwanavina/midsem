package smartHome;

class SmartCam extends SmartDev {
    private boolean motionDetected;

    public SmartCam(String deviceID, String name) {
        super(deviceID, name);
        this.motionDetected = false;
    }

    public void detectMotion() {
        this.motionDetected = true;
        System.out.println(name + " detected motion! Alarm sounding!");
    }
}