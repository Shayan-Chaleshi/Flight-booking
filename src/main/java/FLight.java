public class FLight {
    private String flight_id;
    private String origin;
    private String destination;
    private String date;
    private String time;
    private int price;
    private int seats;


    public String getFlight_id() {
        return flight_id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public int getSeats() {
        return seats;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
