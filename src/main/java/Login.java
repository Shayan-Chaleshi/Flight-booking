import java.io.IOException;
import java.util.Scanner;

public class Login
{


Scanner scanner = new Scanner(System.in);
static User user_list[] = new User[20];
static FLight flight_ary[] = new FLight[20];
static int user_counter = 0;
static int loged_in_index;



User user1 = new User();





/******************************************************************************  welcome  ******************************************************************************/

    void welcome() throws IOException, InterruptedException {
        flight_ary_newer();
        user_newer();
        set_default_flights();
        sign_menu();
    }

/******************************************************************************  Sign in  ******************************************************************************/


    public void sign_menu() throws IOException, InterruptedException
    {
        cls();
        int sign_mod;

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                 Welcome                     *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  please choose a number                     *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  1)sign up                                  *");
        System.out.println("\t\t\t\t*  2)sign in                                  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        sign_mod = scanner.nextInt();


        switch (sign_mod) {
            case 1:
                sign_up();
                break;

            case 2:
                sign_in();
                break;

            default:
                cls();
                System.out.println("invalid input...\npress any key to return...");
                scanner.next();
                sign_menu();

        }


    }



/**********************************************************************************************************************************************************/

public void sign_in() throws IOException, InterruptedException
    {

        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*   please enter your username and password   *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  username:                                  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  password:                                  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        String username;
        String password;

        username = scanner.next();
        password = scanner.next();


        /**  Admin condition  **/
        if (username.toLowerCase().equals("admin") && password.toLowerCase().equals("admin"))
        {
            Admin admin1 = new Admin();
            admin1.admin_menu();
        }

        /**invalid condition*/
        if (User.user_existence_checker(username) == 1)
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*            User does not exist              *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*            please try again...              *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*            press any key to return...       *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

            scanner.next();
            sign_in();
        }

        /** Wrong password **/
        if (user1.user_existence_checker(username, password ) == false)

        {
            cls();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*            incorrect password               *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*            please try again...              *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*            press any key to return...       *");
            System.out.println("\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            sign_in();
        }


        user1.regular_user_menu();


    }


    /**********************************************************************************************************************************************************/
    public void sign_up() throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*   please choose username and password       *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  username:                                  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*  password:                                  *");
        System.out.println("\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String username;
        String password;

        username = scanner.next();
        password = scanner.next();


        if (User.user_existence_checker(username) == 0 || username.toLowerCase().equals("admin") || password.toLowerCase().equals("admin")) {
            System.out.println("this username exist \n try another one...\npress any key to return...");
            scanner.next();
            sign_up();
        }

        else {

            user_list[user_counter].setUsername(username);
            user_list[user_counter].setPassword(password);
            user_counter++;
            sign_menu();

        }
    }





    /********************************************************************************  clear screen  ***************************************************************************************/

    public static void cls() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    /********************************************************** user checker **************************************************************************************************/



    /************************************************************************************************************************************************************/

    static void user_newer() throws IOException, InterruptedException
    {
        for (int i = 0; i < user_list.length; i++)
        {
            user_list[i] = new User();
        }
    }

    /************************************************************************************************************************************************************/

    static void  flight_ary_newer()
    {

        for (int i = 0; i < flight_ary.length; i++)
        {
            flight_ary[i] = new FLight();
        }
    }

    /************************************************************************************************************************************************************/
    void set_default_flights()
    {
        flight_ary[0].setFlight_id("WX-10");
        flight_ary[0].setOrigin("YAZD");
        flight_ary[0].setDestination("TEHRAN");
        flight_ary[0].setDate("1401-12-10");
        flight_ary[0].setTime("12:30");
        flight_ary[0].setPrice(700000);
        flight_ary[0].setSeats(51);

        flight_ary[1].setFlight_id("WX-11");
        flight_ary[1].setOrigin("YAZD");
        flight_ary[1].setDestination("SHIRAZ");
        flight_ary[1].setDate("1401-12-8");
        flight_ary[1].setTime("8:30");
        flight_ary[1].setPrice(400000);
        flight_ary[1].setSeats(72);

        flight_ary[2].setFlight_id("WX-12");
        flight_ary[2].setOrigin("YAZD");
        flight_ary[2].setDestination("MASHHAD");
        flight_ary[2].setDate("1401-12-20");
        flight_ary[2].setTime("17:45");
        flight_ary[2].setPrice(800000);
        flight_ary[2].setSeats(60);
    }

    /************************************************************************************************************************************************************/

    /************************************************************************************************************************************************************/

    /************************************************************************************************************************************************************/

    /************************************************************************************************************************************************************/


}
