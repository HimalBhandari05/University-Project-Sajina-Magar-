import java.util.Scanner;

public class EMSMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the venue name , ");
        String venueName = sc.nextLine();

        System.out.print("enter the venue capacity , ");
        int capacity = sc.nextInt();
        sc.nextLine();

        System.out.print("enter the venue location , ");
        String location = sc.nextLine();

        Venue v1 = new Venue(venueName, capacity, location);

        System.out.print("enter event type 1. workshop , 2. seminar , 3. concert");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("enter the event name , ");
        String eventName = sc.nextLine();

        System.out.print("enter  the event date , ");
        String eventDate = sc.nextLine();

        Event event = null;
        if (choice == 1) {
            System.out.print("enter workshop topic , ");
            String topic = sc.nextLine();
            event = new Workshop(eventName, eventDate, v1, topic);
        } else if (choice == 2) {
            System.out.print("enter seminar speaker , ");
            String speaker = sc.nextLine();
            event = new Seminar(eventName, eventDate, v1, speaker);
        } else if (choice == 3) {
            System.out.print("enter concert performer , ");
            String performer = sc.nextLine();
            event = new Concert(eventName, eventDate, v1, performer);
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        System.out.print("enter organizer name , ");
        String organizerName = sc.nextLine();

        System.out.print("enter organizer contact info , ");
        String contactInfo = sc.nextLine();

        Organizer org = new Organizer(organizerName, contactInfo);

        System.out.print("enter participant name , ");
        String participantName = sc.nextLine();

        System.out.print("enter participant email , ");
        String email = sc.nextLine();

        Participant p1 = new Participant(participantName, email);

        event.displayDetails();
        org.createEvent(event);
        p1.registerEvent(event);

        System.out.println("\n Cancel? == (yes/no) , ");
        String cancel = sc.nextLine();

        if (cancel.equalsIgnoreCase("yes")) {
            event.cancelEvent();
        }

        System.out.println("\nthank you ");
        sc.close();
    }
}
