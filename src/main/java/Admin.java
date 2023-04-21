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
        System.out.println("\t\t\t\t*  0)Sign out                                 *");
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

            case 0:
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
        System.out.println("\t\t\t\t*          [ press + to turn back ]           *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +\n");


        int flight_index = first_null_flight();
        String input;
        FLight temp_flight = new FLight();






        System.out.print("\t\t\t\t\t#  Origin --->  ");
        input=scanner.next();
        if (input.equals("+"))
            admin_menu();

        temp_flight.setOrigin(input);





        System.out.print("\t\t\t\t\t#  Destination --->  ");
        input=scanner.next();
        if (input.equals("+"))
            admin_menu();

        temp_flight.setDestination(input);




        System.out.print("\t\t\t\t\t#  Date --->  ");
        input=scanner.next();
        if (input.equals("+"))
            admin_menu();

        temp_flight.setDate(input);




        System.out.print("\t\t\t\t\t#  Time --->  ");
        input=scanner.next();
        if (input.equals("+"))
            admin_menu();

        temp_flight.setTime(input);



        System.out.print("\t\t\t\t\t#  Price --->  ");
        input=scanner.next();
        if (input.equals("+"))
            admin_menu();

        temp_flight.setPrice(Long.valueOf(input));




        System.out.print("\t\t\t\t\t#  Seats --->  ");
        input=scanner.next();
        if (input.equals("+"))
            admin_menu();

        temp_flight.setSeats(Integer.valueOf(input));

        String id_generator;
        id_generator="WX-";
        id_generator+=FLight.flight_id_generator_counter;
        FLight.flight_id_generator_counter++;
        Login.flight_ary[flight_index].setFlight_id(id_generator.toUpperCase());

        Login.flight_ary[flight_index].setOrigin(temp_flight.getOrigin());
        Login.flight_ary[flight_index].setDestination(temp_flight.getDestination());
        Login.flight_ary[flight_index].setDate(temp_flight.getDate());
        Login.flight_ary[flight_index].setTime(temp_flight.getTime());
        Login.flight_ary[flight_index].setPrice(temp_flight.getPrice());
        Login.flight_ary[flight_index].setSeats(temp_flight.getSeats());





        print_done();
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
        System.out.println("\t\t\t\t*          [ press + to turn back ]           *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String id;
        id = scanner.next();
        if (id.equals("+"))
            admin_menu();

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
            System.out.println("\t\t\t\t*          flight does not exist !             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*       press any key to try again...         *");
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
        while(true)
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
            System.out.println("\t\t\t\t*    4) date                                  *");
            System.out.println("\t\t\t\t*    5) time                                  *");
            System.out.println("\t\t\t\t*    6) price                                 *");
            System.out.println("\t\t\t\t*    7) seats                                 *");
            System.out.println("\t\t\t\t*    0) exit                                  *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

            int edit_mod;
            edit_mod = scanner.nextInt();

            if (edit_mod == 0)
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
            System.out.println("\t\t\t\t*          [ press + to turn back ]           *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");


            edit_flight(flight_index, edit_mod);

            print_done();
        }


    }

    //******************************************** ---->  edit flight logic
    void edit_flight(int flight_index, int mod ) throws IOException, InterruptedException {


        String flight_info;
        flight_info = scanner.next();
        if (flight_info.equals("+"))
            edit_flight_menu2();


        switch (mod) {
            case 1:
                Login.flight_ary[flight_index].setFlight_id(flight_info.toUpperCase());
                break;
            case 2:
                Login.flight_ary[flight_index].setOrigin(flight_info.toUpperCase());
                break;
            case 3:
                Login.flight_ary[flight_index].setDestination(flight_info.toUpperCase());
                break;
            case 4:
                Login.flight_ary[flight_index].setDate(flight_info.toUpperCase());
                break;
            case 5:
                Login.flight_ary[flight_index].setTime(flight_info.toUpperCase());
                break;
            case 6:
                Login.flight_ary[flight_index].setPrice(Integer.valueOf(flight_info));
                break;
            case 7:
                Login.flight_ary[flight_index].setSeats(Integer.valueOf(flight_info));
                break;

        }
    }


    //******************************************** ---->  delete flight
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
        System.out.println("\t\t\t\t*          [ press + to turn back ]           *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");


        String delete_id;
        delete_id = scanner.next().toUpperCase();
        if (delete_id.equals("+"))
            admin_menu();

        int flight_exictance;
        flight_exictance = FLight.if_flight_exist(delete_id);

        if (flight_exictance == -1)
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               Delete menu                   *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*           Flight does not exist !           *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*          Press any key to return...         *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            delete_flight();

        }


        else if (is_flight_bought(delete_id) == true)
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               Delete menu                   *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*               Access Denied !               *");
            System.out.println("\t\t\t\t*        The fLight cannot be deleted.         *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*           Press any key to return...        *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            admin_menu();
        }


        else
        {
            Login.flight_ary[flight_exictance].setFlight_id(null);
            Login.flight_ary[flight_exictance].setDestination(null);
            Login.flight_ary[flight_exictance].setOrigin(null);
            Login.flight_ary[flight_exictance].setDate(null);
            Login.flight_ary[flight_exictance].setTime(null);
            Login.flight_ary[flight_exictance].setPrice(0);
            Login.flight_ary[flight_exictance].setSeats(0);
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
;

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

    //******************************************** ----> is flight bought
    private  boolean is_flight_bought(String flight_id)
    {
        for (int i = 0; i < 20; i++)
        {
            if (Login.user_list[i] != null)
            {
                for (int j = 0; j < 15; j++)
                {
                    if (Login.user_list[Login.loged_in_index].tickets[j] != null)
                    {
                        if (Login.user_list[i].tickets[j].getFlight_id().equals(flight_id))
                            return true;
                    }
                }
            }
        }
        return false;

    }
    //******************************************** ----> print Done

    void print_done() throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Change password               *");
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
    }



}




