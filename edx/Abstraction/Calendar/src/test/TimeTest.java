package test;

import model.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    private Time time;
    private Time time2;
    private Time time3;

    @BeforeEach
    void setUp() {
        time = new Time(13, 40);
        time2 = new Time(12, 0);
        time3 = new Time(0, 9);
    }

    @Test
    void getTime24() {
        assertEquals("13:40", time.getTime24());
        assertEquals("12:00", time2.getTime24());
        assertEquals("0:09", time3.getTime24());
    }

    @Test
    void getTime12() {
        assertEquals("1:40 PM", time.getTime12());
        assertEquals("12:00 PM", time2.getTime12());
        assertEquals("12:09 AM", time3.getTime12());
    }
}