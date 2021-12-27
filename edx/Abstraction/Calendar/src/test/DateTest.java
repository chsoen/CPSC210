package test;

import model.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    private Date date;

    @BeforeEach
    void setUp() {
        date = new Date(12, 5, 2021);
    }

    @Test
    void getShortDate() {
        assertEquals("12-5-2021", date.getShortDate());
    }

    @Test
    void getLongDate() {
        assertEquals("May 12, 2021", date.getLongDate());
    }
}