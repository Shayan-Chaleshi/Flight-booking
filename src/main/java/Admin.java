import java.io.IOException;
import java.util.Scanner;

public class Admin
{

    Scanner scanner=new Scanner(System.in);
    public String username="admin";
    public String password="admin";

    public void add_flight()
    {

    }
    public void delete_flight()
    {

    }

    public void edit_flight()
    {

    }

    public void flight_table() throws IOException, InterruptedException
    {
        Methods method=new Methods();
        method.cls();


        String[] Table_ary = new String[7];

        System.out.print("\n\t\t\t\t\t");
        System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "  Flight ID  ", "   Origins   ", "  Destention  ", "    Data    ", "   Time   ", "   Price   ", "m Seats \n");
        for (int i = 0; i < Table_ary.length; i++) {

            System.out.print("\t\t\t\t\t");
            System.out.print("+---------------------------------------------------------------------------------------------+");
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
            }



            System.out.print("\n\t\t\t\t\t");
            System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i]);
            System.out.println("|");            System.out.print("\n\t\t\t\t\t");

            System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i]);
            System.out.println("|");            System.out.print("\n\t\t\t\t\t");

            System.out.printf("|    %-10s|    %-10s|    %-11s| %-12s|  %-9s|  %-10s|  %-4s  ", Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i], Table_ary[i]);
            System.out.println("|");
            scanner.next();
            method.admin_menu();

        }




    }
}