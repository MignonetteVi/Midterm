package part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Консольное меню (эскиз логики) - я не успела выполнить не столь крвую логику с температурой, нужно было раскрыть работу с термостатом(
public class SmartHomeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHomeController controller = new SmartHomeController();
        SmartHomeFactory factory = new AdvancedSmartHomeFactory();

        Map<String, SmartDevice> registry = new HashMap<>();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить устройство");
            System.out.println("2. Включить/выключить устройство по имени");
            System.out.println("3. Включить все светильники");
            System.out.println("4. Установить глобальную температуру");
            System.out.println("5. Показать статус всех устройств");
            System.out.println("6. Выйти");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Введите тип (light, camera, vacuum, ai_thermostat, motion_sensor, door_lock): ");
                    String type = scanner.nextLine();
                    System.out.print("Имя устройства: ");
                    String name = scanner.nextLine();

                    SmartDevice device = switch (type) {
                        case "light" -> factory.createLight(name);
                        case "camera" -> factory.createCamera(name);
                        case "vacuum" -> factory.createRobotVacuum(name);
                        case "ai_thermostat" -> new AIThermostat(name);
                        case "motion_sensor" -> new MotionSensor(name);
                        case "door_lock" -> new LegacyDoorLockAdapter(new LegacyDoorLock());
                        default -> null;
                    };

                    if (device != null) {
                        registry.put(name, device);
                        controller.addDevice(device);
                        System.out.println("Устройство добавлено.");
                    } else {
                        System.out.println("Неизвестный тип.");
                    }
                }
                case 2 -> {
                    System.out.print("Введите имя устройства: ");
                    String name = scanner.nextLine();
                    SmartDevice device = registry.get(name);
                    if (device != null) {
                        System.out.print("1 - Включить, 2 - Выключить: ");
                        int act = scanner.nextInt();
                        if (act == 1) device.turnOn();
                        else device.turnOff();
                    } else {
                        System.out.println("Устройство не найдено.");
                    }
                }
                case 3 -> controller.turnAllLightsOn();
                case 4 -> {
                    System.out.print("Введите температуру: ");
                    int temp = scanner.nextInt();
                    controller.setGlobalTemperature(temp);
                }
                case 5 -> controller.getSystemStatusReport();
                case 6 -> {
                    System.out.println("Выход.");
                    return;
                }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }
}
