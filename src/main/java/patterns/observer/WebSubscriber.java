package patterns.observer;

public class WebSubscriber implements BaseSubscriber {
    @Override
    public void updateEventPortal(Event event) {
        System.out.printf("New event %s is ready to be updated in the web portal %n", event.name());
    }
}
