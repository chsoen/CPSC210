package test;

import model.Date;
import model.Entry;
import model.Event;
import model.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    private Entry entry;
    private Date date;
    private Time time;

    @BeforeEach
    void setUp() {
        date = new Date(2, 40, 2030);
        time = new Time(16,30);
        entry = new Event(date, time, "Test Entry", true);
    }

    @Test
    void testGetters() {
        assertEquals(date, entry.getDate());
        assertEquals(time, entry.getTime());
        assertEquals("Test Entry", entry.getLabel());
        assertTrue(entry.isRepeating());
    }

    @Test
    void getIntervalOfRepetition() {
        entry.setInterval(7);
        assertEquals(7, entry.getIntervalOfRepetition());
    }
}