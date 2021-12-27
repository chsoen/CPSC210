package model;

public abstract class Entry {
    private Date date;
    private Time time;
    private String label;
    private boolean isRepeating;
    private int interval;

    public Entry(Date date, Time time, String label, boolean isRepeating) {
        this.date = date;
        this.time = time;
        this.label = label;
        this.isRepeating = isRepeating;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getLabel() {
        return label;
    }

    // EFFECTS: return true if the entry is repeating, otherwise false
    public boolean isRepeating() {
        return isRepeating;
    }

    // EFFECTS: return the interval the entry is repeated
    public int getIntervalOfRepetition() {
        return interval;
    }

    // EFFECTS: set the interval of repetition in days
    public void setInterval(int interval) {
        this.interval = interval;
    }
}
