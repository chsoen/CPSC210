package test;

import model.Meeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {
    private Meeting meeting;


    @BeforeEach
    void setUp() {
        meeting = new Meeting(null, null, "test", false);
    }

    @Test
    void addAttendee() {
        meeting.addAttendee("testemail");
        meeting.addAttendee("test@email.com");

        List<String> expected = new ArrayList<>();
        expected.add("testemail");
        expected.add("test@email.com");

        assertEquals(expected, meeting.getAttendees());
    }

    @Test
    void removeAttendee() {
        meeting.addAttendee("testemail");
        meeting.addAttendee("test@email.com");
        meeting.removeAttendee("testemail");

        List<String> expected = new ArrayList<>();
        expected.add("test@email.com");

        assertEquals(expected, meeting.getAttendees());
    }
}