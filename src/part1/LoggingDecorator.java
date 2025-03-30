package part1;

// Декоратор: логирование
class LoggingDecorator extends SmartDeviceDecorator {

    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
