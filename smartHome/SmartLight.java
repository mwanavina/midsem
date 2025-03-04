package smartHome;

class SmartLight extends SmartDev {
    private int brightness;
    private String colorMode;

    public SmartLight(String deviceID, String name) {
        super(deviceID, name);
        this.brightness = 100;
        this.colorMode = "Normal";
    }

    public void setBrightness(int level) {
        this.brightness = level;
    }

    public void setColorMode(String mode) {
        this.colorMode = mode;
    }
}

