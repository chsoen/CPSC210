package test;

import model.File;
import model.FollowUp;
import model.Note;
import model.TextBlock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {
    private Note testNote;

    @BeforeEach
    void setUp() {
        testNote = new Note();
    }

    @Test
    void setTitle() {
        String expected = "test";
        testNote.setTitle(expected);
        assertEquals(expected, testNote.getTitle());
    }

    @Test
    void getContents() {
        TextBlock expected = new TextBlock();
        testNote.setContents(expected);
        assertEquals(expected, testNote.getContents());
    }

    @Test
    void attachFile() {
        File expected = new File();
        testNote.attachFile(expected);
        assertEquals(testNote.getFileForNote(), expected);
    }

//    @Test
//    void initiateFollowUp() {
//        FollowUp expected = new FollowUp();
//        testNote.initiateFollowUp();
//        assertEquals(testNote.getNoteFollowUp(), expected);
//    }
}