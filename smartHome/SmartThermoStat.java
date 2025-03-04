package smartHome;

class SmartThermostat extends SmartDev {
    private int temperature;

    public SmartThermostat(String deviceID, String name) {
        super(deviceID, name);
        this.temperature = 20;
    }

    public void setTemperature(int temp) {
        if (temp < 16 || temp > 30) {
            throw new IllegalArgumentException("Temperature must be between 16°C and 30°C.");
        }
        this.temperature = temp;
        System.out.println("Temperature set to " + temp + "°C.");
    }
}
