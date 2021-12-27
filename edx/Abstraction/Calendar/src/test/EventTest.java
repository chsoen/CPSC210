package test;

import model.Date;
import model.Event;
import model.Reminder;
import model.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {
    private Event event;
    private Reminder reminder1;
    private Reminder reminder2;

    @BeforeEach
    void setUp() {
        event = new Event(null, null, "Test Event", false);

        reminder1 = new Reminder(null, null, "Testing Reminder", false);
        reminder2 = new Reminder(null, null, "Reminder Overwrite", false);
    }

    @Test
    void getReminder() {
        event.setReminder(reminder1);
        assertEquals(reminder1, event.getReminder());
        event.setReminder(reminder2);
        assertEquals(reminder2, event.getReminder());
    }
}