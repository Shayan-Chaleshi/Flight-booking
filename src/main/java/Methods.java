import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Methods
{
    Scanner scanner=new Scanner(System.in);
    User userlist[]=new User[10];
    int user_counter=0;
    int newer_flag=0;
    public void user_newer()
    {
        newer_flag=1;
        for (int i = 0; i < userlist.length; i++)
        {
            userlist[i]=new User();
        }
    }


    public void sign_menu() throws IOException, InterruptedException
    {
        int sign_mod=0;
        cls();
        if (newer_flag==0)
            user_newer();

        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t\t*                 Welcome                     *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  please choose a number                     *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  1)sign up                                  *");
        System.out.println("\t\t\t\t\t*  2)sign in                                  *");
        System.out.println("\t\t\t\t\t*  3)toString                                 *");
        System.out.println("\t\t\t\t\t*                                             *");
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
            case 3 :
                tostring();
                break;

            default :
                System.out.println("invalid input...\npress any key to return...");
                scanner.next();
                sign_menu();

        }


    }



    /***********************************************************************************************************************************************************************/
    public void sign_in () throws IOException, InterruptedException
    {
        cls();

        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*   please enter your username and password   *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  username:                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  password:                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        String username;
        String password;

        username= scanner.next();
        password=scanner.next();


        /**invalid condition*/
        if (user_checker(username)==1)
        {
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            User does not exist              *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            please try again...              *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*                                             *");
            System.out.println("\t\t\t\t\t*            press any key to return...       *");
            System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

            scanner.next();
            sign_in();
        }








    }

/***********************************************************************************************************************************************************************/

    public void sign_up () throws IOException, InterruptedException
    {
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*   please choose username and password       *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  username:                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t*  password:                                  *");
        System.out.println("\t\t\t\t\t*                                             *");
        System.out.println("\t\t\t\t\t+ * * * * * * * * * * * * * * * * * * * * * * +");

        String username;
        String password;

        username= scanner.next();
        password=scanner.next();


       if (user_checker(username)==0)
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





/***********************************************************************************************************************************************************************/

    public static void cls() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

/***********************************************************************************************************************************************************************/

    public int user_checker(String username )throws IOException, InterruptedException
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

/***********************************************************************************************************************************************************************/

    @Override
    public String toString() {
        return "Methods{" +
                "scanner=" + scanner +
                ", userlist=" + Arrays.toString(userlist) +
                ", user_counter=" + user_counter +
                ", newer_flag=" + newer_flag +
                '}';
    }

    /***********************************************************************************************************************************************************************/


public void print()throws IOException, InterruptedException
{
    for (int i = 0; i < userlist.length; i++) {
        System.out.println(userlist.toString());
    }
}

/***********************************************************************************************************************************************************************/

    private void tostring() throws IOException, InterruptedException {
        User instance = new User();
        toString();

        instance.toString();
        System.out.println("press any key to return ...");
        scanner.next();
        sign_menu();
    }
}


