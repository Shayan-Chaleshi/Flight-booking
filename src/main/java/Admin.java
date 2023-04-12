import java.io.IOException;
import java.util.Scanner;

public class Admin
{
    Scanner scanner=new Scanner(System.in);
    private String username="admin";
    private String password="admin";
    FLight[] flight_ary = new FLight[20];
    boolean flight_flag=false;
    int flight_counter=3;


    void flight_ary_newer()
    {
        for (int i = 0; i < flight_ary.length; i++)
        {
            if(flight_flag==false)
            {
                flight_ary[i] = new FLight();


            }
        }
        flight_flag=true;
    }

    void set_default_flights()
    {
        flight_ary[0].setFlight_id("WX-12");
        flight_ary[0].setOrigin("Yazd");
        flight_ary[0].setDestination("Tehran");
        flight_ary[0].setDate("1401-12-10");
        flight_ary[0].setTime("12:30");
        flight_ary[0].setPrice(700000);
        flight_ary[0].setSeats(51);

        flight_ary[1].setFlight_id("WX-13");
        flight_ary[1].setOrigin("Yazd");
        flight_ary[1].setDestination("Shiraz");
        flight_ary[1].setDate("1401-12-8");
        flight_ary[1].setTime("8:30");
        flight_ary[1].setPrice(400000);
        flight_ary[1].setSeats(72);

        flight_ary[2].setFlight_id("WX-14");
        flight_ary[2].setOrigin("Yazd");
        flight_ary[2].setDestination("Mashhad");
        flight_ary[2].setDate("1401-12-20");
        flight_ary[2].setTime("17:45");
        flight_ary[2].setPrice(800000);
        flight_ary[2].setSeats(60);
    }

    /*****************************************************************************************************************************************************************************/
    /*****************************************************************************************************************************************************************************/

    void add_flight(String fligt_id)throws IOException, InterruptedException
    {



    }

    /*****************************************************************************************************************************************************************************/

    void delete_flight()
    {

    }

    /*****************************************************************************************************************************************************************************/

    void edit_flight()
    {

    }

    /*****************************************************************************************************************************************************************************/

    public void setUsername(String username) {
        this.username = username;
    }

    /*****************************************************************************************************************************************************************************/

    public void setPassword(String password) {
        this.password = password;
    }

    /*****************************************************************************************************************************************************************************/

    public String getUsername() {
        return username;
    }

    /*****************************************************************************************************************************************************************************/

    public String getPassword() {
        return password;
    }

/*****************************************************************************************************************************************************************************/
    public void flight_table() throws IOException, InterruptedException
    {
        Methods method=new Methods();
        method.cls();
        flight_ary_newer();
        set_default_flights();
        make_flights_empty();

        flight_ary[3].setFlight_id("");






        System.out.print("\n\t\t\t\t\t");
        System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "  Flight ID  ", "   Origins   ", "  Destention  ", "    Data    ", "   Time   ", "   Price   ", "m Seats \n");
        System.out.print("\n\t\t\t\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");

        for (int i = 0; i < flight_counter; i++)
        {

            System.out.print("\n\t\t\t\t\t");
            System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", flight_ary[i].getFlight_id(), flight_ary[i].getOrigin(), flight_ary[i].getDestination(), flight_ary[i].getDate(), flight_ary[i].getTime(), flight_ary[i].getPrice(), flight_ary[i].getSeats());
            System.out.println("|");
            System.out.print("\n\t\t\t\t\t");
            System.out.print("+---------------------------------------------------------------------------------------------+");
        }

        System.out.print("\n\t\t\t\t\t");
        System.out.println("press any key to return...");
        scanner.next();
            method.admin_menu();

    }



/*****************************************************************************************************************************************************************************/

     void make_flights_empty()
    {
        for (int i = 3; i < flight_ary.length; i++)
        {

            flight_ary[i].setFlight_id("");
            flight_ary[i].setDestination("");
            flight_ary[i].setOrigin("");
            flight_ary[i].setDate("");
            flight_ary[i].setTime("");

        }

    }

/*****************************************************************************************************************************************************************************/

boolean if_flight_exist(String flight_id)
    {
        for (int i = 0; i < flight_ary.length; i++)
        {
            if (flight_id.equals(flight_ary[i].getFlight_id()))
                return true;
        }

        return false;
    }

/*****************************************************************************************************************************************************************************/














}