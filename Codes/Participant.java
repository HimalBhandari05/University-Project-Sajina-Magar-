public class Participant {
    private String participantName;
    private String email;

    public Participant(String participantName, String email) {
        this.participantName = participantName;
        this.email = email;
    }

    public String getParticipantName() { 
        return participantName; 
    }
    public void setParticipantName(String participantName) { 
        this.participantName = participantName; 
    }
    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }

    public void registerEvent(Event e) {
        System.out.println(participantName + " has successfully registered for " + e.getEventName());
    }
    public void registerEvent(Event e, String feedback) {
        System.out.println(participantName + " registered for: '" + e.getEventName());
        System.out.println("feedback: " + feedback);
    }
}
