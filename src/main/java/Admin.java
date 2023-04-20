import java.io.IOException;
import java.util.Scanner;

public class Admin
{
    Scanner scanner=new Scanner(System.in);
    private String username="admin";
    private String password="admin";


    int flight_index;

    FLight flight1 = new FLight();


    //******************************************** ----> Functions
    public void setUsername(String username ) {
        this.username = username;
    }


    public void setPassword(String password ) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    //******************************************** ----> admin menu

    public void admin_menu() throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Admin menu                    *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  1)Add                                      *");
        System.out.println("\t\t\t\t*  2)Update                                   *");
        System.out.println("\t\t\t\t*  3)Remove                                   *");
        System.out.println("\t\t\t\t*  4)Flight schedules                         *");
        System.out.println("\t\t\t\t*  5)Sign out                                 *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        int admin_mod ;

        admin_mod = scanner.nextInt();


        switch (admin_mod)
        {
            case 1:
                add_flight();
                break;

            case 2:
                edit_flight_menu1();
                break;

            case 3:
                delete_flight();
                break;

            case 4:
                flight1.flight_table(1);
                break;

            case 5:
                Login login1 = new Login();
                login1.sign_menu();
                break;

            default:
                System.out.println("invalid input.\nplease tyr again\npress any key to return ....");
                scanner.next();
                admin_menu();
        }
    }

    //******************************************** ---->  add flight
    void add_flight()throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               add flight                    *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  please enter the following info to add :   *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*   1---> Origin                              *");
        System.out.println("\t\t\t\t*   2---> Destination                         *");
        System.out.println("\t\t\t\t*   3---> Time                                *");
        System.out.println("\t\t\t\t*   4---> Date                                *");
        System.out.println("\t\t\t\t*   5---> Price                               *");
        System.out.println("\t\t\t\t*   6---> Seats                               *");
        System.out.println("\t\t\t\t*   7---> Exit                                *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +\n");

        int flight_index = first_null_flight();
        String input;


        input="WX-";
        input+=FLight.id_generator_counter;
        FLight.id_generator_counter++;
        Login.flight_ary[flight_index].setFlight_id(input.toUpperCase());


        System.out.print("\t\t\t\t\t#  Origin --->  ");
        input=scanner.next();
        Login.flight_ary[flight_index].setOrigin(input.toUpperCase());


        System.out.print("\t\t\t\t\t#  Destination --->  ");
        input=scanner.next();
        Login.flight_ary[flight_index].setDestination(input.toUpperCase());


        System.out.print("\t\t\t\t\t#  Date --->  ");
        input=scanner.next();
        Login.flight_ary[flight_index].setDate(input);


        System.out.print("\t\t\t\t\t#  Time --->  ");
        input=scanner.next();
        Login.flight_ary[flight_index].setTime(input);

        System.out.print("\t\t\t\t\t#  Price --->  ");
        input=scanner.next();
        Login.flight_ary[flight_index].setPrice(Integer.valueOf(input));

        System.out.print("\t\t\t\t\t#  Seats --->  ");
        input=scanner.next();
        Login.flight_ary[flight_index].setSeats(Integer.valueOf(input));

        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t     Done!\n\n");
        System.out.println("\n\t\t\t\t\t    Press any key to return...");
        scanner.next();
        FLight.flights_counter++;
        admin_menu();
    }

    //******************************************** ---->  edit menu 1
    void edit_flight_menu1() throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               edit flight                   *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  please enter a flight id to edit details:  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String id;
        id = scanner.next();

        FLight flight1 = new FLight();

        flight_index=flight1.if_flight_exist(id.toUpperCase());
        if ( flight_index == -1)
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               edit flight                    *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*        flight does not exist                *");
            System.out.println("\t\t\t\t*        press any key to try again...        *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            edit_flight_menu1();
        }

        else
        {
            edit_flight_menu2();
        }

    }

    //******************************************** ---->  edit menu 2
    void edit_flight_menu2() throws IOException, InterruptedException
    {

        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               edit flight                   *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*      which one do you want to change        *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*    1) flight id                             *");
        System.out.println("\t\t\t\t*    2) origin                                *");
        System.out.println("\t\t\t\t*    3) destination                           *");
        System.out.println("\t\t\t\t*    5) time                                  *");
        System.out.println("\t\t\t\t*    6) price                                 *");
        System.out.println("\t\t\t\t*    7) seats                                 *");
        System.out.println("\t\t\t\t*    8) exit                                  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        int edit_mod;
        edit_mod = scanner.nextInt();

        if (edit_mod==8)
            admin_menu();


        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               edit flight                    *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*   enter the new value and press enter :     *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");





        edit_flight(flight_index , edit_mod);

        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               edit flight                   *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                   Done!                     *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*          Press any key to return...         *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        scanner.next();
        admin_menu();

    }

    //******************************************** ---->  edit flight logic
    void edit_flight(int flight_index, int mod ) {


        String fligt_info;
        fligt_info = scanner.next();

        switch (mod) {
            case 1:
                Login.flight_ary[flight_index].setFlight_id(fligt_info.toUpperCase());
                break;
            case 2:
                Login.flight_ary[flight_index].setOrigin(fligt_info.toUpperCase());
                break;
            case 3:
                Login.flight_ary[flight_index].setDestination(fligt_info.toUpperCase());
                break;
            case 4:
                Login.flight_ary[flight_index].setDate(fligt_info.toUpperCase());
                break;
            case 5:
                Login.flight_ary[flight_index].setTime(fligt_info.toUpperCase());
                break;
            case 6:
                Login.flight_ary[flight_index].setPrice(Integer.valueOf(fligt_info));
                break;
            case 7:
                Login.flight_ary[flight_index].setSeats(Integer.valueOf(fligt_info));
                break;

        }
    }


    //******************************************** ---->  delete menu
    void delete_flight() throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Delete menu                   *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*        Enter flight id to delete :          *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String delete_id;
        delete_id = scanner.next().toUpperCase();
        FLight fLight = new FLight();

        int flight_exictance;
        flight_exictance = fLight.if_flight_exist(delete_id);
        System.out.println(flight_exictance);

        if (flight_exictance != -1)
        {

            Login.flight_ary[flight_exictance].setFlight_id(null);
            Login.flight_ary[flight_exictance].setDestination(null);
            Login.flight_ary[flight_exictance].setOrigin(null);
            Login.flight_ary[flight_exictance].setDate(null);
            Login.flight_ary[flight_exictance].setTime(null);
            Login.flight_ary[flight_exictance].setPrice(0);
            Login.flight_ary[flight_exictance].setSeats(0);
        }

        else
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               Delete menu                   *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*           Flight does not exist             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*           Press any key to return...        *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            delete_flight();
        }

        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Delete menu                   *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*         Flight successfully deleted :)      *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*           Press any key to return...        *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        scanner.next();
        admin_menu();

    }

    //******************************************** ---->  check flight is null
    int first_null_flight()
    {
        for (int i = 0; i < Login.flight_ary.length; i++)
        {
            if ( Login.flight_ary[i].getFlight_id() == null )
                return i;
        }
        return -1;
    }

    //******************************************** ---->  clear screen
    public static void cls() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    /************************************************************************************************************************************************************/




}




