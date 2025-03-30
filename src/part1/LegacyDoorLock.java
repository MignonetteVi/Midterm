package part1;

// Адаптер(абстракция для примера): старый замок двери
class LegacyDoorLock {
    boolean locked = false;
    public void unlockDoor() {
        System.out.println("Замок разблокирован (устаревшая система!)");
        locked = false;
    }

    public void lockDoor() {
        System.out.println("Замок заблокирован (устаревшая система!)");
        locked = true;
    }
}
