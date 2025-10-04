public class Concert extends Event {
    private String performer;

    public Concert(String eventName, String eventDate, Venue venue, String performer) {
        super(eventName, eventDate, venue);
        this.performer = performer;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== concert information ===");
        System.out.println("\nevent name: " + getEventName());
        System.out.println("\nperformer: " + performer);
        System.out.println("\ndate: " + getEventDate());
        getVenue().displayVenue();
    }
}
