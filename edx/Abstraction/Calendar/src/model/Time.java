package model;

public class Time {
    // Class invariant: hours in between 0 and 23, minutes in between 0 and 60
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // EFFECTS: returns the time in a 24-hour format
    public String getTime24() {
        return hours + ":" + getMinutesFormatted();
    }

    // EFFECTS: returns the time in a 12-hour format
    public String getTime12() {
        if (hours == 12) {
            return 12 + ":" + getMinutesFormatted() + " PM";
        }
        if (hours == 0) {
            return 12 + ":" + getMinutesFormatted() + " AM";
        }
        return hours < 12 ? hours + ":" + getMinutesFormatted()
                + " AM" : hours - 12 + ":"
                + getMinutesFormatted() + " PM";
    }

    private String getMinutesFormatted() {
        if (minutes < 10) {
            return "0" + minutes;
        }
        return String.valueOf(minutes);
    }
}
