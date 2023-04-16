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

    public void setUsername(String username  )
    {

        this.username = username;

    }

    public void setPassword(String password)
    {
        this.password = password;
    }



/************************************************************************************************************************************************************/
/************************************************************************************************************************************************************/

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
        Login login = new Login();

        for (int i = 0; i < Login.user_list.length; i++) {
            if (username.equals(Login.user_list[i].getUsername()) && password.equals(Login.user_list[i].getPassword())) {
                login.loged_in_index = i;
                return true;

            }
        }
        return false;
    }

    /********************************************************************************************************************************************************* */
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
                ticket_cancelation();

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

    /************************************************************************************************************************************************************/

    private void add_charge()throws IOException, InterruptedException
    {


    }

    /************************************************************************************************************************************************************/

    private void booked_ticket()throws IOException, InterruptedException
    {


    }

    /************************************************************************************************************************************************************/

    private void ticket_cancelation() throws IOException, InterruptedException
    {


    }

    /************************************************************************************************************************************************************/

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

        while (true)
        {
            search_mod = scanner.nextInt();

            switch (search_mod) {

                case 1, 2, 3, 4, 5, 7:
                    search_flight(0);
                    break;

                case 6:
                    search_flight(1);
                    break;


                case 0:
                    regular_user_menu();
                    break;

            }
            cls();
            System.out.println("end of filter switch case !");
            if (scanner.nextInt()==85)
                break;

        }

























        System.out.print("\n\n\n\n\n\n\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");
        System.out.printf("\n\t\t| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "  Flight ID  ", "   Origins   ", "  Destention  ", "    Data    ", "   Time   ", "   Price   ", " Seats ");
        System.out.print("\n\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");



        for (int i = 0; i < FLight.flight_counter; i++)
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
        admin1.admin_menu();


    }

    /************************************************************************************************************************************************************/

    private void booking_ticket() throws IOException, InterruptedException
    {


    }

    /************************************************************************************************************************************************************/

    private void change_password()throws IOException, InterruptedException
    {
        Login login1 = new Login();
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

        Login.user_list[login1.loged_in_index].setPassword(new_password);


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
        regular_user_menu();

    }

/************************************************************************************************************************************************************/

   public boolean password_checker( String last_pass )
   {

       Login login = new Login();

       if (last_pass.equals (Login.user_list[login.loged_in_index].getPassword()) )
       {
           return true;
       }

       return false ;
   }

    /************************************************************************************************************************************************************/


    public static void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    /************************************************************************************************************************************************************/

   void search_flight( int mod ) throws IOException, InterruptedException {
       cls();
       System.out.println("in the filter method \npress any key to return");
       scanner.next();
   }

    /************************************************************************************************************************************************************/


}
