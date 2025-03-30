package part1;

// Продвинутое устройство: Датчик движения
class MotionSensor implements SmartDevice {
    private String name;
    private boolean motionDetected = false;

    public MotionSensor(String name) {
        this.name = name;
    }

    public boolean isMotionDetected() {
        return motionDetected;
    }

    public void simulateMotion() {
        motionDetected = true;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " активирован (датчик движения!.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " деактивирован (датчик движения!).");
    }

    @Override
    public String getStatus() {
        return name + ": Обнаружение движения — " + (motionDetected ? "зафиксировано" : "отсутствует");
    }
}
