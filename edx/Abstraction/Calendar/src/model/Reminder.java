package model;

public class Reminder extends Entry {
    private String note;

    public Reminder(Date date, Time time, String label, boolean isRpeating) {
        super(date, time, label, isRpeating);
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
