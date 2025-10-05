public abstract class Event implements Schedulable {
    private String eventName;
    private String eventDate;
    private Venue venue;

    public abstract void displayDetails();

    public Event(String eventName, String eventDate, Venue venue) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.venue = venue;
    }
    public String getEventName() { 
        return eventName; 
    }
    public void setEventName(String eventName) {
        this.eventName = eventName; 
    }

    public String getEventDate() { 
        return eventDate; 
    }
    public void setEventDate(String eventDate) { 
        this.eventDate = eventDate;
    }

    public Venue getVenue() { 
        return venue; 
    }
    public void setVenue(Venue venue) { 
        this.venue = venue; 
    }


    public void scheduleEvent() {
        System.out.println(eventName + "' has been scheduled for " + eventDate + " at " + venue.getVenueName());
    }

    public void cancelEvent() {
        System.out.println("the event '" + eventName + "' has been cancelled.");
    }
}
