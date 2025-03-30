package part1;

// Конкретные устройства (Листовые элементы для Composite Pattern)
class Light implements SmartDevice {
    private String name;
    boolean isActive;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " включен.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " выключен.");
    }

    @Override
    public String getStatus() {
        return  name + ":" + (isActive ? "Активен" : "Не активен");
    }
}
