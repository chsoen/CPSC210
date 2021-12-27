package test;

import model.Reminder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReminderTest {
    private Reminder reminder;

    @BeforeEach
    void setUp() {
        reminder = new Reminder(null, null, "Test Reminder", false);
    }

    @Test
    void testGetters() {
        reminder.setNote("This is a note.");
        assertEquals("This is a note.", reminder.getNote());
    }
}