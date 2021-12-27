package tests;

import model.Transcript;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TranscriptTest {

    private Transcript testTranscript;

    @BeforeEach
    public void setUp(){
        testTranscript = new Transcript("Student Name", 1000);
        testTranscript.addGrade("CPSC-210", 3.0);
    }

    @Test
    void testGetStudentName() {
        assertEquals("Student Name", testTranscript.getStudentName());
    }

    @Test
    void testAddGrade() {
        assertTrue(testTranscript.getCourseAndGrade("CPSC-210") != null);
    }

    @Test
    void testGetCourseAndGrade() {
    }

    @Test
    void testPrintTranscript() {
    }

    @Test
    void testGetGPA() {
    }
}
