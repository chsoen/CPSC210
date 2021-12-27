package test;

import model.RainfallRecords;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RainfallRecordsTest {
    private RainfallRecords rainfallRecords;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        rainfallRecords = new RainfallRecords(0);
    }

    @org.junit.jupiter.api.Test
    void addRecord() {
        rainfallRecords.addRecord(1);
        assertEquals(2, rainfallRecords.getNumRecords());
    }

    @org.junit.jupiter.api.Test
    void addAllRecords() {
        ArrayList<Integer> records = new ArrayList<>(Arrays.asList(4, 5, 0, 0, 2, 3));
        rainfallRecords.addAllRecords(records);
        assertEquals(7, rainfallRecords.getNumRecords());
    }

    @org.junit.jupiter.api.Test
    void getNumRecords() {
        assertEquals(1, rainfallRecords.getNumRecords());
    }

    @org.junit.jupiter.api.Test
    void getTotalRainfall() {
        ArrayList<Integer> records = new ArrayList<>(Arrays.asList(4, 5, 0, 0, 2, 3));
        rainfallRecords.addAllRecords(records);

        assertEquals(14, rainfallRecords.getTotalRainfall());
    }

    @org.junit.jupiter.api.Test
    void getMaxRainfall() {
        ArrayList<Integer> records = new ArrayList<>(Arrays.asList(4, 5, 0, 0, 2, 3));
        rainfallRecords.addAllRecords(records);

        assertEquals(5, rainfallRecords.getMaxRainfall());
    }
}