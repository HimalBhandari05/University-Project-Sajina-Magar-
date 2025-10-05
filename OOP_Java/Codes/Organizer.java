public class Organizer {
    private String organizerName;
    private String contactInfo;

    public Organizer(String organizerName, String contactInfo) {
        this.organizerName = organizerName;
        this.contactInfo = contactInfo;
    }

    public void createEvent(Event e) {
        System.out.println("\nOrganizer " + organizerName + " has successfully created a new event: '" + e.getEventName() + "'");
        e.scheduleEvent();
    }

    public void manageEvent(Event e) {
        System.out.println("\nOrganizer " + organizerName + " is now managing the event: '" + e.getEventName() + "'");
    }
}

