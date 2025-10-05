public class Workshop extends Event {
    private String topic; 

    public Workshop(String eventName, String eventDate, Venue venue, String topic) {
        super(eventName, eventDate, venue);
        this.topic = topic;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== Workshop Data ===");
        System.out.println("Event Name: " + getEventName());
        System.out.println("Topic: " + topic);
        System.out.println("Date: " + getEventDate());
        getVenue().displayVenue();
    }
}
