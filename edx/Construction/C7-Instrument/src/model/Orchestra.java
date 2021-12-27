package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orchestra {
    private List<BrassInstrument> brassInstruments;
    private List<StringInstrument> stringInstruments;

    public Orchestra(String name) {
        brassInstruments = new ArrayList<>();
        stringInstruments = new ArrayList<>();
    }

    public void addBrassInstrument(BrassInstrument brass) {
        if (!brassInstruments.contains(brass)) {
            brassInstruments.add(brass);
            brass.setOrchestra(this);
        }
    }

    public void addStringInstrument(StringInstrument string) {
        if (!stringInstruments.contains(string)) {
            stringInstruments.add(string);
            string.setOrchestra(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orchestra orchestra = (Orchestra) o;
        return Objects.equals(brassInstruments, orchestra.brassInstruments) && Objects.equals(stringInstruments, orchestra.stringInstruments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brassInstruments, stringInstruments);
    }
}
