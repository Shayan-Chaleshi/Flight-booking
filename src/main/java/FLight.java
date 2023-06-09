import java.io.IOException;
import java.util.Scanner;

public class FLight {
    private String flight_id;
    private String origin;
    private String destination;
    private String date;
    private String time;
    private long price;
    private int seats;



    static int flight_id_generator_counter = 13;


    Scanner scanner = new Scanner(System.in);


//******************************************** ---->  Functions

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

    public long getPrice() {
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

    public void setPrice(long price) {
        this.price = price;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

//******************************************** ----> flight table

    public void flight_table(int return_mod) throws IOException, InterruptedException
    {
        cls();


        System.out.print("\n\n\n\n\n\n\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");
        System.out.printf("\n\t\t| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "  Flight ID  ", "   Origins   ", "  Destention  ", "    Data    ", "   Time   ", "   Price   ", " Seats ");
        System.out.print("\n\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");

        for (int i = 0; i < Login.flight_ary.length; i++)
        {

            if (Login.flight_ary[i].getFlight_id() != null)
            {

                System.out.print("\n\t\t");
                System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                System.out.printf("|");
                System.out.print("\n\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");

            }
        }

            System.out.print("\n\n\n\t\t\t\t\t");
            System.out.println("press any key to return...");
            scanner.next();
            Admin admin1 = new Admin();
            User user = new User();

            if (return_mod == 1 )
                admin1.admin_menu();
            else
                user.regular_user_menu();



    }

//******************************************** ----> clear screen

    public static void cls() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

//******************************************** ----> if flight exist

    public static int if_flight_exist( String id )
    {
        for (int i = 0; i <Login.flight_ary.length ; i++)
        {
            if ( Login.flight_ary[i].getFlight_id() != null  &&   id.equals(Login.flight_ary[i].getFlight_id())  )
                return i ;
        }

        return -1;
    }


    

}
