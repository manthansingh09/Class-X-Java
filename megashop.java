import java.util.*;
public class megashop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int fl;
        double am;
        boolean floor=true;
        System.out.println("Enter Floor Number");
        fl=sc.nextInt();
        switch(fl)
        {
            case 1:
            System.out.println("Welcome to Kids Wear");
            break;
            case 2:
            System.out.println("Welcome to Ladies Wear");
            break;
            case 3:
            System.out.println("Welcome to Designer Sarees");
            break;
            case 4:
            System.out.println("Welcome to Men's Wear");
            break;
            default:
            floor=false;
            System.out.println("Wrong Choice");
        }
        if(floor)
        {
            System.out.println("Enter Bill Amount");
            am=sc.nextInt();
            System.out.println("Printed Bill");
            System.out.println("Name of Shop: City Mart");
            System.out.println("Total Amount: "+am);
            System.out.println("Visit Again!!!!");
        }
    }
}