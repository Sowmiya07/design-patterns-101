package patterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasePublisher {

    private final Map<EventType, List<BaseSubscriber>> eventSubscribers;

    BasePublisher() {
        this.eventSubscribers = new HashMap<>();
    }

    public void subscribe(EventType eventType, BaseSubscriber subscriber) {
        List<BaseSubscriber> subscribers = this.eventSubscribers.computeIfAbsent(eventType, k -> new ArrayList<>());
        subscribers.add(subscriber);
        System.out.printf("Subscriber Added... Count %d%n", subscribers.size());
    }

    public void unSubscribe(EventType eventType, BaseSubscriber subscriber) {
        List<BaseSubscriber> subscribers = this.eventSubscribers.get(eventType);
        if(subscribers != null) {
            subscribers.remove(subscriber);

            if(subscribers.isEmpty()) {
                this.eventSubscribers.remove(eventType);
            }

            System.out.printf("Subscriber Removed...Count %d%n", subscribers.size());
        }
    }

    public void notify(Event event) {
        List<BaseSubscriber> subscribers = this.eventSubscribers.get(event.type());

        if(subscribers != null) {
            for(BaseSubscriber subscriber: subscribers) {
                subscriber.updateEventPortal(event);
            }
        } else {
            System.out.printf("No subscribers found for the event %s%n", event.type());
        }
    }
}
