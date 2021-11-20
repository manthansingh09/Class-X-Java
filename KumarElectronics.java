import java.util.*;
public class KumarElectronics
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,net;
        int b;
        System.out.println("Enter Name ");
        String name=sc.nextLine();
        System.out.println("Enter Purchase Amount");
        a=sc.nextInt();
        System.out.println("Enter 1 for Laptop and 2 for Desktop");
        b=sc.nextInt();
        switch(b)
        {
            case 1:
            if(a<=25000)
            {
                System.out.println("No Discount");
                System.out.println("Name "+name);
                System.out.println("Net Price "+a);
                System.out.println("Thanks for Purchasing Laptop");
            }
            else if(a<=50000)
            {
                net=a-(a*5/100);
                System.out.println("Name "+name);
                System.out.println("Net Price "+net);
                System.out.println("Thanks for Purchasing Laptop");
            }
            else if(a<=100000)
            {
                net=a-(a*7.5/100);
                System.out.println("Name "+name);
                System.out.println("Net Price "+net);
                System.out.println("Thanks for Purchasing Laptop");
            }
            else
            {
                net=a-(a*10/100);
                System.out.println("Name "+name);
                System.out.println("Net Price "+net);
                System.out.println("Thanks for Purchasing Laptop");
            }
            break;
            case 2:
            if(a<=25000)
            {
                net=a-(a*5/100);
                System.out.println("Name "+name);
                System.out.println("Net Price "+a);
                System.out.println("Thanks for Purchasing Desktop");
            }
            else if(a<=50000)
            {
                net=a-(a*7.5/100);
                System.out.println("Name "+name);
                System.out.println("Net Price "+net);
                System.out.println("Thanks for Purchasing Desktop");
            }
            else if(a<=100000)
            {
                net=a-(a*10/100);
                System.out.println("Name "+name);
                System.out.println("Net Price "+net);
                System.out.println("Thanks for Purchasing Desktop");
            }
            else
            {
                net=a-(a*15/100);
                System.out.println("Name "+name);
                System.out.println("Net Price "+net);
                System.out.println("Thanks for Purchasing Desktop");
            }
            break;
            default:
            System.out.println("Wrong Input");
            break;
        }
    }
}
