package model;

public class Main {
    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public static void main(String[] args) {
        Date date;
        Time time;
        Entry entry;

        date = new Date(2,3,2021);
        Calendar calendar = new Calendar(date);

        date = new Date(9, 12, 2021);
        time = new Time(12, 30);
        Event event = new Event(date, time, "Secret Santa", false);

        Reminder reminder;
        reminder = new Reminder(date, time, "Secret Santa Reminder", false);
        event.setReminder(reminder);

        calendar.addEntry(event);
        calendar.addEntry(reminder);

        date = new Date(12, 4, 2021);
        time = new Time(14, 50);
        Meeting meeting = new Meeting(date, time, "Management Conference", false);
        calendar.addEntry(meeting);

        meeting.addAttendee("lulw@gmail.com");
        meeting.addAttendee("helloWorld@hotmail.com");
        meeting.addAttendee("invalidemail@notreal.com");
        meeting.removeAttendee("invalidemail@notreal.com");
        meeting.sendInvites();
        meeting.setInterval(7);
    }
}
