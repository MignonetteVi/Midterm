package part1;

// Адаптер: для легаси замка двери
class LegacyDoorLockAdapter implements SmartDevice {
    private LegacyDoorLock lock;

    public LegacyDoorLockAdapter(LegacyDoorLock lock) {
        this.lock = lock;
    }

    @Override
    public void turnOn() {
        lock.unlockDoor();
    }

    @Override
    public void turnOff() {
        lock.lockDoor();
    }

    @Override
    public String getStatus() {
        return "Замок двери: " + (lock.isLocked() ? "Заблокирован" : "Разблокирован");
    }
}
