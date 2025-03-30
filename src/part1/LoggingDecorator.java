package part1;

// Декоратор: логирование
class LoggingDecorator extends SmartDeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("logging!: Включение устройства...");
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("logging!: Выключение устройства...");
        super.turnOff();
    }
}
