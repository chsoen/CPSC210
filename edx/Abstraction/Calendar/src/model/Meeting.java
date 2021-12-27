package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Meeting extends Entry {
    private List<String> attendees;

    public Meeting(Date date, Time time, String label, boolean isRepeating) {
        super(date, time, label, isRepeating);
        attendees = new ArrayList<>();
    }

    // EFFECTS: adds attendee to attendees
    public void addAttendee(String attendee) {
        attendees.add(attendee);
    }

    // EFFECTS: removes attendee from attendees
    public void removeAttendee(String attendee) {
        attendees.remove(attendee);
    }

    // EFFECTS: prints out all emails that are sent invitations
    public void sendInvites() {
        for (String attendee : attendees) {
            System.out.println("Inviting: " + attendee);
        }
    }

    // EFFECTS: returns an unmodifiable list of attendees
    public List<String> getAttendees() {
        return Collections.unmodifiableList(attendees);
    }
}
