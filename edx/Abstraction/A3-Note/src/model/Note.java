package model;

public class Note {

    private String title;
    private TextBlock contents;
    private FollowUp noteFollowUp;
    private File fileForNote;

    // Constructor to create an empty new note
    // MODIFIES: this
    // EFFECTS: constructs an empty note
    public Note() {
    }

    // Set the title of the note
    // REQUIRES: title is a non-empty string
    // MODIFIES: this
    // EFFECTS: this.title = title
    public void setTitle(String title) {
        this.title = title;
    }

    // Get the contents of the note
    // EFFECTS: returns the contents TextBlock, may be empty
    public TextBlock getContents() {
        return contents;
    }

    // Set the contents of the note
    // REQUIRES: contents is a non-empty text block
    // MODIFIES: this
    // EFFECTS: this.contents = contents
    public void setContents(TextBlock contents) {
        this.contents = contents;
    }

    // Attach a file to the note
    // REQUIRES: fileToAttach is well-formed file available on filesystem
    // MODIFIES: this
    // EFFECTS: attaches the given file to the note
    public void attachFile(File fileToAttach) {
        fileForNote = fileToAttach;
    }

    // Start a follow-up discussion
    // MODIFIES: this
    // EFFECTS: replaces this.noteFollowUp with a new FollowUp
    public void initiateFollowUp() {
        noteFollowUp = new FollowUp();
    }

    public String getTitle() {
        return title;
    }

    public FollowUp getNoteFollowUp() {
        return noteFollowUp;
    }

    public void setNoteFollowUp(FollowUp noteFollowUp) {
        this.noteFollowUp = noteFollowUp;
    }

    public File getFileForNote() {
        return fileForNote;
    }

    public void setFileForNote(File fileForNote) {
        this.fileForNote = fileForNote;
    }
}
