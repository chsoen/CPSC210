package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calendar {
    private Date date;
    private String email;
    private List<Entry> entries;

    public Calendar(Date date) {
        this.date = date;
        entries = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public void removeEntry(Entry entry) {
        entries.add(entry);
    }

    public List<Entry> getEntries() {
        return (List<Entry>) Collections.unmodifiableCollection(entries);
    }
}
