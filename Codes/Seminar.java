// Seminar events - educational talks and presentations
public class Seminar extends Event {
    private String speaker;  // Who will be giving the presentation

    public Seminar(String eventName, String eventDate, Venue venue, String speaker) {
        super(eventName, eventDate, venue);
        this.speaker = speaker;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== SEMINAR INFORMATION ===");
        System.out.println("Event Name: " + getEventName());
        System.out.println("Speaker: " + speaker);
        System.out.println("Date: " + getEventDate());
        getVenue().displayVenue();
    }
}
