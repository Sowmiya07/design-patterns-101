package patterns.observer;

public class MainPublisher {
    public static void main(String[] args) {
        BasePublisher publisher = new BasePublisher();

        WebSubscriber webSubscriber = new WebSubscriber();
        MobileSubscriber mobileSubscriber = new MobileSubscriber();

        publisher.subscribe(EventType.DANCE, mobileSubscriber);
        publisher.subscribe(EventType.MUSIC, webSubscriber);

        publisher.subscribe(EventType.PLAY, mobileSubscriber);
        publisher.subscribe(EventType.PLAY, webSubscriber);

        Event danceEvent = new Event(1, "Sizzlers Dance", EventType.DANCE, "London Central");
        publisher.notify(danceEvent);

        Event musicEvent = new Event(2, "Opera", EventType.MUSIC, "West London");
        publisher.notify(musicEvent);

        Event playEvent = new Event(3, "Shakespeare Tales", EventType.PLAY, "North West London");
        publisher.notify(playEvent);

        Event magicEvent = new Event(4, "Dozen Magic Show", EventType.MAGIC, "East London");
        publisher.notify(magicEvent);
    }
}
