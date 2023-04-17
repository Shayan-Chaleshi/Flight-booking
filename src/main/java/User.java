import java.io.IOException;
import java.util.Scanner;

public class User
{

    private String username;
    private String password;

    private int vault;

    Scanner scanner = new Scanner (System.in);


    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public int getVault() {
        return vault;
    }

    public void setUsername(String username)
    {

        this.username = username;

    }

    public void setVault(int vault)
    {
        this.vault = vault;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


    //******************************************** ----> Functions

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

    //******************************************** ----> regular menu
    public void regular_user_menu() throws IOException, InterruptedException
    {
        Login login = new Login();

        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*               Passenger menu                *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*   1) Change password                        *");
        System.out.println("\t\t\t\t*   2) Search flight ticket                   *");
        System.out.println("\t\t\t\t*   3) Booking ticket                         *");
        System.out.println("\t\t\t\t*   4) Ticket cancellation                    *");
        System.out.println("\t\t\t\t*   5) Booked ticket                          *");
        System.out.println("\t\t\t\t*   6) Add charge                             *");
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
                booking_ticket();

            case 4 :
                ticket_cancellation();

            case 5 :
                booked_ticket();

            case 6 :
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
        System.out.printf("\t\t\t\t*   current vault is : %8s               *\n",5000);
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*                                             *");
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
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        Login.user_list[Login.loged_in_index].setVault(  ( Login.user_list[Login.loged_in_index].getVault() + scanner.nextInt() ) );

        print_done();
        System.out.println("\n\n\t\t\t\t\t\tvault is : " + Login.user_list[Login.loged_in_index].getVault());
        scanner.next();
        regular_user_menu();

    }

    //******************************************** ----> booked ticket


    private void booked_ticket()throws IOException, InterruptedException
    {


    }

    //******************************************** ----> ticket cancellation

    private void ticket_cancellation() throws IOException, InterruptedException
    {


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
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

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

    //******************************************** ----> booking ticket

    private void booking_ticket() throws IOException, InterruptedException
    {


    }

    //******************************************** ----> change password

    private void change_password()throws IOException, InterruptedException
    {
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
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String last_pass;
        last_pass = scanner.next();

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
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String new_password;
        new_password = scanner.next();

        Login.user_list[Login.loged_in_index].setPassword(new_password);


        print_done();

        scanner.next();
        regular_user_menu();

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

    //******************************************** ----> clear screen


    public static void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    //******************************************** ----> search origin

   void filter_by_origin() throws IOException, InterruptedException
   {
       cls();
       boolean null_flag=true;
       String filter ;
       print_search_box();
       filter = scanner.next().toUpperCase();

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
    //******************************************** ----> search id

   void filter_by_id() throws IOException, InterruptedException
   {
       cls();
       boolean null_flag=true;
       String filter ;
       print_search_box();
       filter = scanner.next().toUpperCase();

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
    //******************************************** ----> search destination

   void filter_by_dest() throws IOException, InterruptedException
   {
       cls();
       boolean null_flag=true;
       String filter ;
       print_search_box();
       filter = scanner.next().toUpperCase();

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
       int min_filter , max_filter;
       price_search_box();

       System.out.print("\n\t\t\t\tmin ---> ");
       min_filter = scanner.nextInt();

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
    //******************************************** ----> search seats
   void filter_by_seats() throws IOException, InterruptedException
   {
       cls();
       boolean null_flag=true;
       int filter ;
       print_search_box();
       filter = scanner.nextInt();

       table_head_printer();

       for (int i = 0; i < Login.flight_ary.length; i++)
       {

           if (filter == Login.flight_ary[i].getSeats())
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
        System.out.println("\t\t\t\t* ::::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * * +");
    }

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
        System.out.println("\t\t\t\t* :::::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * *  +");
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
