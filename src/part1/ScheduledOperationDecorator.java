package part1;

import java.time.LocalTime;

// Интерфейс умного устройства
class ScheduledOperationDecorator extends SmartDeviceDecorator {
    private LocalTime startTime;
    private LocalTime endTime;

    public ScheduledOperationDecorator(SmartDevice device) {
        super(device);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public void turnOn() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(startTime) && now.isBefore(endTime)) {
            System.out.println("shedule!: Сейчас подходящее время — устройство включается.");
            super.turnOn();
        } else {
            System.out.println("shedule!: Вне времени расписания — устройство не включается.");
        }
    }
}
