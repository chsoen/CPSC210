package model;

public class Date {
    // Class invariant: month is in between 1 and 12, day is in between 1 and 31
    private static final String[] MONTHS = {"January", "Feburary", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"};
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // EFFECTS: returns the short date
    public String getShortDate() {
        return day + "-" + month + "-" + year;
    }

    // REQUIRES: month in between 1 and 12
    // EFFECTS: returns the long date
    public String getLongDate() {
        return MONTHS[month - 1] + " " + day + ", " + year;
    }
}
