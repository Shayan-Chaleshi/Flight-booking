import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Methods
{
/******************************************************************************  Global variables  ******************************************************************************/
/********************************************************************************************************************************************************************************/
    Scanner scanner=new Scanner(System.in);
    User userlist[]=new User[10];
    int user_counter=0;
    int newer_flag=0;

    int loged_in_index;

    Admin adm= new Admin();


/******************************************************************************************************************************************************************************/
/******************************************************************************  Sign in  ******************************************************************************/
    public void sign_menu() throws IOException, InterruptedException
    {
        cls();
        int sign_mod=0;
        if (newer_flag==0)
            user_newer();
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t*                 Welcome                     *");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  please choose a number                     *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  1)sign up                                  *");
        System.out.println("\t\t\t\t\t*  2)sign in                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        sign_mod=scanner.nextInt();


        switch (sign_mod)
        {
            case 1 :
                sign_up();
                break;

            case 2 :
                sign_in();
                break;

            default :
                System.out.println("invalid input...\npress any key to return...");
                scanner.next();
                sign_menu();

        }


    }



    /******************************************************************************  Sign in  ******************************************************************************/
    public void sign_in () throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*   please enter your username and password   *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  username:                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  password:                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        String username;
        String password;

        username= scanner.next();
        password=scanner.next();


        /**  Admin condition  **/
            if (username.toLowerCase().equals("admin") && password.toLowerCase().equals("admin") )
                admin_menu();


        /**invalid condition*/
        if (user_existence_checker(username)==1)
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            User does not exist              *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            please try again...              *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            press any key to return...       *");
            System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

            scanner.next();
            sign_in();
        }

        /** Wrong password **/
        if (user_existence_checker(username,password)==false)
        {
            cls();
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            incorrect password               *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            please try again...              *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            press any key to return...       *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
            System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            scanner.next();
            sign_in();
        }


        regular_user_menu();





    }




    /****************************************************************************  sign up  ***********************************************************************************/

    public void sign_up () throws IOException, InterruptedException
    {
        cls();
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*   please choose username and password       *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  username:                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  password:                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String username;
        String password;

        username= scanner.next();
        password=scanner.next();


       if (user_existence_checker(username)==0 || username.toLowerCase().equals("admin") || password.toLowerCase().equals("admin") )
       {
           System.out.println("this username exist \n try another one...\npress any key to return...");
           scanner.next();
           sign_up();
       }

       else
       {

           userlist[user_counter].setUsername(username);
           userlist[user_counter].setPassword(password);
           user_counter++;
           sign_menu();

           }
       }





/********************************************************************************  clear screen  ***************************************************************************************/

    public static void cls() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

/********************************************************************************  user checker  ***************************************************************************************/

    public int user_existence_checker(String username )throws IOException, InterruptedException
    {

        for (int i = 0; i < userlist.length; i++)
        {
            if( username.equals(userlist[i].username) )
            {
                return 0;
            }
        }
        return 1;
    }

    /**override*/
    public boolean user_existence_checker(String username , String password)throws IOException, InterruptedException
    {

        for (int i = 0; i < userlist.length; i++)
        {
            if( username.equals(userlist[i].username) && password.equals(userlist[i].password))
            {
                loged_in_index=i;
                return true;

            }
        }
        return false;
    }

    /*********************************************************************************  user menu  **************************************************************************************/


    public void regular_user_menu() throws IOException, InterruptedException {
        cls();
        System.out.println("logged in");
        scanner.next();
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t*               Passenger menu                *");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t*      ................................       *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  1)sign up                                  *");
        System.out.println("\t\t\t\t\t*  2)sign in                                  *");
        System.out.println("\t\t\t\t\t*  3)toString                                 *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

    }

/*********************************************************************************  Admin menu  **************************************************************************************/

    public void admin_menu() throws IOException, InterruptedException
    {
        cls();
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t*               Admin menu                    *");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  1)Add                                      *");
        System.out.println("\t\t\t\t\t*  2)Update                                   *");
        System.out.println("\t\t\t\t\t*  3)Remove                                   *");
        System.out.println("\t\t\t\t\t*  4)Flight schedules                         *");
        System.out.println("\t\t\t\t\t*  5)Sign out                                 *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*:::::::::::::::::::::::::::::::::::::::::::: *");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        int admin_mod=0;

        admin_mod=scanner.nextInt();


        switch (admin_mod)
        {
            case 1 :
                adm.add_flight();

            case 2 :
                adm.edit_flight();

            case 3 :
                adm.delete_flight();

            case 4 :
                adm.flight_table();

            case 5 :
                sign_menu();

            default:
                System.out.println("invalid input.\nplease tyr again\npress any key to return ....");
                scanner.next();
                admin_menu();
        }
    }
/*************************************************************************  Array newer  ************************************************************************************************/

        public void user_newer() throws IOException, InterruptedException
        {
            newer_flag=1;
            for (int i = 0; i < userlist.length; i++)
            {
                userlist[i]=new User();
            }
        }




/*************************************************************************  Flight table  ************************************************************************************************/





}
/*************************************************************************           ************************************************************************************************/





//
//            System.out.print("\n\t\t\t\t\t\t\t\t\t\033[90m      << Flights List >>\033[97m\n");
//
//            System.out.println("\033[35m");
//            System.out.print("\t\t\t\t\t");
//            System.out.print("+---------------------------------------------------------------------------------------------+");
//            try{Thread.sleep(80);}catch(InterruptedException e) {};
//
//
//            System.out.print("\n\t\t\t\t\t");
//            System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|","\033[33m  Flight ID  \033[35m","\033[33m   Origins   \033[35m","\033[33m  Destention  \033[35m","\033[33m    Data    \033[35m","\033[33m   Time   \033[35m","\033[33m   Price   \033[35m","\033[33m Seats \033[35m");
//            System.out.println();
//            try{Thread.sleep(80);}catch(InterruptedException e) {};
//
//
//            for (int i = 0; i < matrix.length; i++)
//            {
//
//                System.out.print("\033[35m\t\t\t\t\t");
//                System.out.print("+---------------------------------------------------------------------------------------------+");
//                try{Thread.sleep(80);}catch(InterruptedException e) {};
//
//
//                System.out.print("\n\t\t\t\t\t");
//                System.out.printf("|\033[97m    %-10s\033[35m|\033[97m    %-10s\033[35m|\033[97m    %-11s\033[35m|\033[97m %-12s\033[35m|\033[97m  %-9s\033[35m|\033[97m  %-10s\033[35m|\033[97m  %-4s\033[35m  ",matrix[i],matrix[i],matrix[i],matrix[i],matrix[i],matrix[i],matrix[i]);
//                System.out.println("|");
//                try{Thread.sleep(80);}catch(InterruptedException e) {};
//
//            }
//
//
//            System.out.print("\t\t\t\t\t");
//            System.out.print("+---------------------------------------------------------------------------------------------+");
//
//
//
//        }
//
//
//