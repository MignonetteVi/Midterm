package part1;

// Расширенная фабрика
class AdvancedSmartHomeFactory implements SmartHomeFactory {

    @Override
    public Light createLight(String name) {
        return new Light(name);
    }

    @Override
    public Camera createCamera(String name) {
        return new Camera(name);
    }

    @Override
    public RobotVacuum createRobotVacuum(String name) {
        return new RobotVacuum(name);
    }

    public AIThermostat createAIThermostat(String name) {
        return new AIThermostat(name);
    }

    public MotionSensor createMotionSensor(String name) {
        return new MotionSensor(name);
    }
}
