package ui;

import model.File;
import model.Note;

public class Main {
    public static void main(String[] args) {
        Note note = new Note();
        note.setTitle("Hello World");
        note.initiateFollowUp();
        note.attachFile(new File());
    }
}
