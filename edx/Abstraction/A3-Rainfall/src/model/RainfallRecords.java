package model;

import java.util.ArrayList;
import java.util.List;

public class RainfallRecords {
    private List<Integer> records;

    // constructor
    // EFFECTS: creates rainfall data with first rainfall record
    public RainfallRecords(Integer firstRecord) {
        records = new ArrayList<>();
        records.add(firstRecord);
    }

    // REQUIRES: record be a non-negative integer
    // MODIFIES: this
    // EFFECTS: adds a record of the rainfall to records in millimetres
    public void addRecord(int record) {
        records.add(record);
    }

    // MODIFIES: this
    // EFFECTS: adds all records from given list to this object's list of records
    public void addAllRecords(List<Integer> records) {
        this.records.addAll(records);
    }

    // EFFECTS: returns the size of records
    public int getNumRecords() {
        return records.size();
    }

    // EFFECTS: returns the total amount of rainfall in records
    public int getTotalRainfall() {
        int total = 0;
        for (int record : records) {
            total += record;
        }
        return total;
    }

    // EFFECTS: returns the maximum rainfall recorded
    public int getMaxRainfall() {
        int max = 0;
        for (int record : records) {
            if (record > max) {
                max = record;
            }
        }
        return max;
    }
}
