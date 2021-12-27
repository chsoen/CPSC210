package ui;

import model.RainfallRecords;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RainfallRecords rainfallRecords = new RainfallRecords(0);
        rainfallRecords.addAllRecords(new ArrayList<>(Arrays.asList(4, 5, 0, 0, 0, 2, 3)));
        System.out.println(rainfallRecords.getTotalRainfall());
        System.out.println(rainfallRecords.getMaxRainfall());
    }
}
