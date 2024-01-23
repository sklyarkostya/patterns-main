package notifications;

import observers.Observer;

public class StaffNotifications implements Observer {

    private final int locationId;

    public StaffNotifications(int locationId) {
        this.locationId = locationId;
    }

    @Override
    public void notify(String message) {
        System.out.printf("Insurance company %s: %s\n", locationId, message);
    }
}
