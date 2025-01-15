package patterns.observer;

public class MobileSubscriber implements BaseSubscriber {
    @Override
    public void updateEventPortal(Event event) {
        System.out.printf("New event %s is ready to be updated in the mobile portal %n", event.name());
    }
}
