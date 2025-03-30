package part1;

class Camera implements SmartDevice {
    private String name;
    boolean isActive;

    public Camera(String name) {
        this.name = name;
        isActive = false;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " активирована.");
        isActive = true;
    }

    @Override
    public void turnOff() {
        System.out.println(name + " деактивирована.");
        isActive = false;
    }

    @Override
    public String getStatus() {
        return  name + ":" + (isActive ? "Активен" : "Не активен");
    }
}
