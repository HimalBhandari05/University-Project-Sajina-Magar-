public class Venue {
    private String venueName;  
    private int capacity;      
    private String location;  

    public Venue(String venueName, int capacity, String location) {
        this.venueName = venueName;
        this.capacity = capacity;
        this.location = location;
    }

    public String getVenueName() { 
        return venueName; 
    }
    public int getCapacity() { 
        return capacity; 
    }
    public String getLocation() { 
        return location; 
    }
    public void displayVenue() {
        System.out.println("Venue: " + venueName);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " people");
    }
}
