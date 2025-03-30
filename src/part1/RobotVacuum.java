package part1;

class RobotVacuum implements SmartDevice {
    private String name;
    boolean isActive;

    public RobotVacuum(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " начал уборку.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " остановил уборку.");
    }

    @Override
    public String getStatus() {
        return  name + ":" + (isActive ? "Активен" : "Не активен");
    }
}
