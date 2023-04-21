public class Ticket
{
    private int ticket_id;
    private String flight_id;
    private boolean status=false;

    public static int ticket_id_generator_counter=0;
    public int getTicket_id() {
        return ticket_id;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
