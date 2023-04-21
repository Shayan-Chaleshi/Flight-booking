import java.io.IOException;
import java.util.Scanner;

public class User
{
    Scanner scanner = new Scanner (System.in);


    private String username;
    private String password;
    private long wallet ;
    private int ticket_counter=0;
    Ticket tickets[] = new Ticket[15];




    public int getTicket_counter()
    {
        return ticket_counter;
    }
    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public long getVault()
    {
        return wallet;
    }

    public void setUsername(String username)
    {

        this.username = username;

    }

    public void setVault(long vault)
    {
        this.wallet = vault;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setTicket_counter(int ticket_counter)
    {
        this.ticket_counter = ticket_counter;
    }
    //******************************************** ----> Functions <---- ********************************************



    //******************************************** ----> regular menu
    public void regular_user_menu() throws IOException, InterruptedException
    {
        Login login = new Login();
        FLight fLight = new FLight();

        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Passenger menu                *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*   1) Change password                        *");
        System.out.println("\t\t\t\t*   2) Search flight                          *");
        System.out.println("\t\t\t\t*   3) Show flights table                     *");
        System.out.println("\t\t\t\t*   4) Booking ticket                         *");
        System.out.println("\t\t\t\t*   5) Ticket cancellation                    *");
        System.out.println("\t\t\t\t*   6) Booked ticket                          *");
        System.out.println("\t\t\t\t*   7) Add charge                             *");
        System.out.println("\t\t\t\t*   0) Sign out                               *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        int menu_mod;
        menu_mod = scanner.nextInt();

        switch (menu_mod)
        {
            case 1 :
                change_password();

            case 2 :
                search_flight_menu();

            case 3 :
                fLight.flight_table(0);
                
            case 4 :
                booking_ticket();

            case 5 :
                ticket_cancellation();

            case 6 :
                booked_ticket();

            case 7 :
                add_charge();

            case 0 :
                login.sign_menu();

            default:
                cls();
                System.out.println("invalid input...\npress any key to return...");
                scanner.next();
                regular_user_menu();




        }

    }

    //******************************************** ----> change password

    private void change_password()throws IOException, InterruptedException
    {
        String new_password;
        cls();

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Change password               *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*      PLease enter your last password :      *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*         [ press + to turn back ]            *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String last_pass;
        last_pass = scanner.next();
        if (last_pass.equals("+"))
            regular_user_menu();

        if ( password_checker(last_pass) == false )
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               Change password               *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*            Wrong password !                 *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*        press any key to try again ...       *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            change_password();
        }

        while (true)
        {

            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               Change password               *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*        PLease enter new password :          *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*         [ press + to turn back ]            *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");


            new_password = scanner.next();
            if (new_password.equals("+"))
                regular_user_menu();

            if (new_password.equals(Login.user_list[Login.loged_in_index].getPassword())) {
                cls();
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
                System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
                System.out.println("\t\t\t\t*               Change password               *");
                System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
                System.out.println("\t\t\t\t*                                             *");
                System.out.println("\t\t\t\t*                                             *");
                System.out.println("\t\t\t\t*            password is used!                *");
                System.out.println("\t\t\t\t*             enter a new one                 *");
                System.out.println("\t\t\t\t*                                             *");
                System.out.println("\t\t\t\t*                                             *");
                System.out.println("\t\t\t\t*          Press any key to return...         *");
                System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
                System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
                scanner.next();

            }

            else
                break;
        }

        Login.user_list[Login.loged_in_index].setPassword(new_password);


        print_done();

        regular_user_menu();

    }

    //******************************************** ----> search menu

    private void search_flight_menu() throws IOException, InterruptedException
    {
        cls();

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Search flight                 *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*    Filter by :                              *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*    1) Flight id                             *");
        System.out.println("\t\t\t\t*    2) Origin                                *");
        System.out.println("\t\t\t\t*    3) Destination                           *");
        System.out.println("\t\t\t\t*    4) Date                                  *");
        System.out.println("\t\t\t\t*    5) Time                                  *");
        System.out.println("\t\t\t\t*    6) Price                                 *");
        System.out.println("\t\t\t\t*    7) Seats                                 *");
        System.out.println("\t\t\t\t*    0) Exit                                  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +\n\n");
        int search_mod;


        search_mod = scanner.nextInt();

        switch (search_mod)
        {

            case 1 :
                filter_by_id();
                break;

            case 2:
                filter_by_origin();
                break;

            case 3:
                filter_by_dest();
                break;

            case 4:
                filter_by_date();
                break;

            case 5:
                filter_by_time();
                break;

            case 6:
                filter_by_price();
                break;

            case 7:
                filter_by_seats();
                break;

            case 0:
                regular_user_menu();
                break;

        }
    }

    //******************************************** ----> print search table

    void print_search_box()throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t* ::::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Search flight                   *");
        System.out.println("\t\t\t\t* ::::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                               *");
        System.out.println("\t\t\t\t*                                               *");
        System.out.println("\t\t\t\t*  PLease enter what you want to filter by :    *");
        System.out.println("\t\t\t\t*                                               *");
        System.out.println("\t\t\t\t*                                               *");
        System.out.println("\t\t\t\t*         [ press + to turn back ]              *");
        System.out.println("\t\t\t\t* ::::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * * +");
    }

    //******************************************** ----> table header
    void table_head_printer() throws IOException, InterruptedException
    {
        cls();
        System.out.print("\n\n\n\n\n\n\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");
        System.out.printf("\n\t\t| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "  Flight ID  ", "   Origins   ", "  Destention  ", "    Data    ", "   Time   ", "   Price   ", " Seats ");
        System.out.print("\n\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");
    }

    //******************************************** ----> search id
    void filter_by_id() throws IOException, InterruptedException
    {
        cls();
        boolean null_flag=true;
        String filter ;
        print_search_box();
        filter = scanner.next().toUpperCase();
        if (filter.equals("+"))
            regular_user_menu();

        table_head_printer();

        for (int i = 0; i < Login.flight_ary.length; i++)
        {

            if (filter.equals(Login.flight_ary[i].getFlight_id()))
            {

                null_flag=false;
                System.out.print("\n\t\t");
                System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                System.out.printf("|");
                System.out.print("\n\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
            }

        }


        if ( null_flag == true )
        {
            System.out.println("\n\t\t\t\t\t\t\t Nothing found !");
        }

        System.out.println("\n\n\n press any key to return ...");
        scanner.next();
        regular_user_menu();



    }


    //******************************************** ----> search origin

    void filter_by_origin() throws IOException, InterruptedException
    {
        cls();
        boolean null_flag=true;
        String filter ;
        print_search_box();
        filter = scanner.next().toUpperCase();
        if (filter.equals("+"))
            regular_user_menu();

        table_head_printer();

        for (int i = 0; i < Login.flight_ary.length; i++)
        {
//           System.out.println("\n\nfilter is :" + filter );
//           System.out.println("flight id is :" + Login.flight_ary[i].getFlight_id());
//           scanner.next();
            if (filter.equals(Login.flight_ary[i].getOrigin()))
            {

                null_flag=false;
                System.out.print("\n\t\t");
                System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                System.out.printf("|");
                System.out.print("\n\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
            }

        }


        if ( null_flag == true )
        {
            System.out.println("\n\t\t\t\t\t\t\t Nothing found !");
        }

        System.out.println("\n\n\n press any key to return ...");
        scanner.next();
        regular_user_menu();

    }

    //******************************************** ----> search destination

    void filter_by_dest() throws IOException, InterruptedException
    {
        cls();
        boolean null_flag=true;
        String filter ;
        print_search_box();
        filter = scanner.next().toUpperCase();
        if (filter.equals("+"))
            regular_user_menu();

        table_head_printer();

        for (int i = 0; i < Login.flight_ary.length; i++)
        {

            if (filter.equals(Login.flight_ary[i].getDestination()))
            {

                null_flag=false;
                System.out.print("\n\t\t");
                System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                System.out.printf("|");
                System.out.print("\n\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
            }

        }


        if ( null_flag == true )
        {
            System.out.println("\n\t\t\t\t\t\t\t Nothing found !");
        }

        System.out.println("\n\n\n press any key to return ...");
        scanner.next();
        regular_user_menu();



    }

    //******************************************** ----> search date

    void filter_by_date() throws IOException, InterruptedException
    {
        cls();
        boolean null_flag=true;
        String filter ;
        print_search_box();
        filter = scanner.next();
        if (filter.equals("+"))
            regular_user_menu();

        table_head_printer();

        for (int i = 0; i < Login.flight_ary.length; i++)
        {

            if (filter.equals(Login.flight_ary[i].getDate()))
            {

                null_flag=false;
                System.out.print("\n\t\t");
                System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                System.out.printf("|");
                System.out.print("\n\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
            }

        }


        if ( null_flag == true )
        {
            System.out.println("\n\t\t\t\t\t\t\t Nothing found !");
        }

        System.out.println("\n\n\n press any key to return ...");
        scanner.next();
        regular_user_menu();



    }


    //******************************************** ----> search time

    void filter_by_time() throws IOException, InterruptedException
    {
        cls();
        boolean null_flag=true;
        String filter ;
        print_search_box();
        filter = scanner.next();
        if (filter.equals("+"))
            regular_user_menu();

        table_head_printer();

        for (int i = 0; i < Login.flight_ary.length; i++)
        {

            if (filter.equals(Login.flight_ary[i].getTime()))
            {

                null_flag=false;
                System.out.print("\n\t\t");
                System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                System.out.printf("|");
                System.out.print("\n\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
            }

        }


        if ( null_flag == true )
        {
            System.out.println("\n\t\t\t\t\t\t\t Nothing found !");
        }

        System.out.println("\n\n\n press any key to return ...");
        scanner.next();
        regular_user_menu();



    }

    //******************************************** ----> search price

    void filter_by_price() throws IOException, InterruptedException
    {
        cls();
        boolean null_flag=true;
        String first_input;
        int min_filter , max_filter;
        price_search_box();

        System.out.print("\n\t\t\t\tmin ---> ");
        first_input = scanner.next();
        if (first_input.equals("+"))
            regular_user_menu();

        min_filter=Integer.valueOf(first_input);

        System.out.print("\t\t\t\tmax ---> ");
        max_filter = scanner.nextInt();


        table_head_printer();

        for (int i = 0; i < Login.flight_ary.length; i++)
        {

            if ( Login.flight_ary[i].getPrice() >= min_filter && Login.flight_ary[i].getPrice() <= max_filter )
            {

                null_flag=false;
                System.out.print("\n\t\t");
                System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                System.out.printf("|");
                System.out.print("\n\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
            }

        }


        if ( null_flag == true )
        {
            System.out.println("\n\t\t\t\t\t\t\t Nothing found !");
        }

        System.out.println("\n\n\n press any key to return ...");
        scanner.next();
        regular_user_menu();

    }

    //******************************************** ----> price search table
    void price_search_box()throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * *  +");
        System.out.println("\t\t\t\t* :::::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Search flight                    *");
        System.out.println("\t\t\t\t* :::::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                                *");
        System.out.println("\t\t\t\t*                                                *");
        System.out.println("\t\t\t\t*  PLease enter price range want to filter by :  *");
        System.out.println("\t\t\t\t*                                                *");
        System.out.println("\t\t\t\t*                                                *");
        System.out.println("\t\t\t\t*           [ press + to turn back ]             *");
        System.out.println("\t\t\t\t* :::::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * *  +");
    }

    //******************************************** ----> search seats
    void filter_by_seats() throws IOException, InterruptedException
    {
        cls();
        boolean null_flag=true;
        int filter;
        String  filteer ;
        print_search_box();
        filteer = scanner.next();
        if (filteer.equals("+"))
            regular_user_menu();

        filter=Integer.valueOf(filteer);

        table_head_printer();

        for (int i = 0; i < Login.flight_ary.length; i++)
        {

            if (filter <= Login.flight_ary[i].getSeats())
            {

                null_flag=false;
                System.out.print("\n\t\t");
                System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                System.out.printf("|");
                System.out.print("\n\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
            }

        }


        if ( null_flag == true )
        {
            System.out.println("\n\t\t\t\t\t\t\t Nothing found !");
        }

        System.out.println("\n\n\n press any key to return ...");
        scanner.next();
        regular_user_menu();

    }

    //******************************************** ----> booking ticket

    private void booking_ticket() throws IOException, InterruptedException
    {
        FLight flight = new FLight();
        cls();

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Booking ticket                *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*           Please enter flight id :          *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*         [ press + to turn back ]            *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String flight_id = scanner.next();
        if (flight_id.equals("+"))
            regular_user_menu();

        int flight_index = flight.if_flight_exist(flight_id.toUpperCase());

        if( flight_index == -1 )
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               Booking ticket                *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*           Flight does not exist!            *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*           press any key to return ...       *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            booking_ticket();
        }

        if ( is_wallet_enough(flight_index) == false)
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               Booking ticket                *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*          your wallet isn't enough !         *");
            System.out.println("\t\t\t\t*            charge your wallet !             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*           press any key to return ...       *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            regular_user_menu();
        }

        if ( is_flight_full(flight_index) == true )
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*               Booking ticket                *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*             flight is full !                *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*          press any key to return ...        *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            regular_user_menu();
        }


        for (int i = 0; i <15 ; i++)
        {
            if (Login.user_list[Login.loged_in_index].tickets[i] == null)
            {

                Login.user_list[Login.loged_in_index].tickets[i] = new Ticket();

                Login.user_list[Login.loged_in_index].tickets[i].setFlight_id(flight_id.toUpperCase());
                Login.user_list[Login.loged_in_index].tickets[i].setStatus(true);
                Login.user_list[Login.loged_in_index].tickets[i].setTicket_id(159100 + Ticket.ticket_id_generator_counter);

                Ticket.ticket_id_generator_counter++;
                Login.flight_ary[flight_index].setSeats((Login.flight_ary[flight_index].getSeats() - 1));
                Login.user_list[Login.loged_in_index].setVault(Login.user_list[Login.loged_in_index].getVault() - Login.flight_ary[flight_index].getPrice() );
                break;
            }
        }
        print_done();
        regular_user_menu();






    }

    //******************************************** ----> ticket cancellation

    private void ticket_cancellation() throws IOException, InterruptedException
    {
        cls();

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*            Ticket cancellation              *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*        Please enter your ticket id :        *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*          [ press + to turn back ]           *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        String input = scanner.next();
        if (input.equals("+"))
            regular_user_menu();

        int to_delete_ticket = Integer.valueOf(input);

        int ticket_index = is_ticket_exist(to_delete_ticket) ;

        if ( ticket_index == -1 )
        {
            cls();

            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*            Ticket cancellation              *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*           Ticket does not exist!            *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*          Press any key to return...         *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        }


        tickets[ticket_index].setFlight_id(null);
        tickets[ticket_index].setTicket_id(0);
        tickets[ticket_index].setStatus(false);
        tickets[ticket_index] = null ;
        print_done();


    }

    //******************************************** ----> is ticket exist
    private int is_ticket_exist(int  ticket_id)
    {
        for (int i = 0; i < 15; i++)
        {
            if (ticket_id == Login.user_list[Login.loged_in_index].tickets[i].getTicket_id())
                return i ;
        }

        return -1 ;
    }

    //******************************************** ----> booked ticket

    private void booked_ticket()throws IOException, InterruptedException
    {


        cls();


        System.out.print("\n\n\n\n\n\n\t\t");
        System.out.print("+-----------------------------------------------------------------------------------------------------------------+");
        System.out.printf("\n\t\t| %-2s| %-2s| %-2s| %-2s| %-2s| %-2s| %-2s| %-1s|", "   Ticket ID   ", "   Flight ID   ", "   Origins   ", "  Destination  ", "    Data    ", "   Time   ", "   Price   ", " Seats ");
        System.out.print("\n\t\t");
        System.out.print("+-----------------------------------------------------------------------------------------------------------------+");

        for (int i = 0; i < 20; i++)
        {
            if (Login.flight_ary[i] != null)
            {
                for (int k = 0; k < 15; k++)
                {
                    if (Login.user_list[Login.loged_in_index].tickets[k] != null)
                    {

                        if (Login.user_list[Login.loged_in_index].tickets[k].getFlight_id().equals(Login.flight_ary[i].getFlight_id()))
                        {


                            System.out.print("\n\t\t");
                            System.out.printf("|    %-10s  |     %-10s |    %-10s|     %-9s  |  %-10s |   %-7s |   %-9s|   %-4s ", Login.user_list[Login.loged_in_index].tickets[k].getTicket_id(), Login.flight_ary[i].getFlight_id(), Login.flight_ary[i].getOrigin(), Login.flight_ary[i].getDestination(), Login.flight_ary[i].getDate(), Login.flight_ary[i].getTime(), Login.flight_ary[i].getPrice(), Login.flight_ary[i].getSeats());
                            System.out.printf("|");
                            System.out.print("\n\t\t");
                            System.out.print("+-----------------------------------------------------------------------------------------------------------------+");

                        }

                    }
                }
            }
        }





        System.out.println("\n\n\t\t\tpress any key to return ...");
        scanner.next();
        regular_user_menu();


    }

    //******************************************** ----> add charge

    private void add_charge()throws IOException, InterruptedException
    {
        cls();

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                 Add charge                  *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.printf("\t\t\t\t* current vault is : %10s               *\n",Login.user_list[Login.loged_in_index].getVault());
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*          Press any key to return...         *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        scanner.next();

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                 Add charge                  *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  PLease enter how much you want to spend :  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*          [ press + to turn back ]           *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String input = scanner.next();
        if (input.equals("+"))
            regular_user_menu();

        long amount = Long.valueOf(input);
        Login.user_list[Login.loged_in_index].setVault(  ( Login.user_list[Login.loged_in_index].getVault() + amount ) );


        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                 Add charge                  *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.printf("\t\t\t\t*           wallet is : %-10s            *\n",Login.user_list[Login.loged_in_index].getVault());
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*         Press any key to return...          *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");


        scanner.next();
        regular_user_menu();

    }



    //******************************************** ----> clear screen

    public static void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
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

    //******************************************** ----> is flight full
    private boolean is_flight_full(int flight_index )
    {
        if (Login.flight_ary[flight_index].getSeats() != 0  )
            return false ;

        else
         return true;

    }

    //******************************************** ----> is wallet enough
    private boolean is_wallet_enough(int flight_index)
    {
        if (Login.user_list[Login.loged_in_index].getVault() >= Login.flight_ary[flight_index].getPrice() )
            return true;

        else
            return false;
    }

    //******************************************** ----> user existence
    public  static int user_existence_checker(String username ) throws IOException, InterruptedException {

        for (int i = 0; i < Login.user_list.length; i++) {
            if (username.equals(Login.user_list[i].getUsername())) {
                return 0;
            }
        }

        return 1;
    }

    /**
     * override
     */

    public boolean user_existence_checker(String username, String password) throws IOException, InterruptedException
    {


        for (int i = 0; i < Login.user_list.length; i++) {
            if (username.equals(Login.user_list[i].getUsername()) && password.equals(Login.user_list[i].getPassword())) {
                Login.loged_in_index = i;
                return true;

            }
        }
        return false;
    }

    //******************************************** ----> password checker

    public boolean password_checker( String last_pass )
    {

        if (last_pass.equals (Login.user_list[Login.loged_in_index].getPassword()) )
        {
            return true;
        }

        return false ;
    }



}
