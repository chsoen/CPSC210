import java.util.Objects;

public class Route {
    private Airport arrival;
    private Airport departure;

    public Route(Airport arrival, Airport departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public Airport getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(arrival, route.arrival) && Objects.equals(departure, route.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrival, departure);
    }
}
