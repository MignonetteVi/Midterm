package part1;

// Продвинутое устройство: AI-Термостат
class AIThermostat implements SmartDevice {
    private int temperature;
    private String name;

    public AIThermostat(String name) {
        this.name = name;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println(name + ": Температура установлена на " + temp + "°C");
    }

    @Override
    public void turnOn() {
        System.out.println(name + " включён.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " выключен.");
    }

    @Override
    public String getStatus() {
        return name + ": Температура " + temperature + "°C";
    }
}
