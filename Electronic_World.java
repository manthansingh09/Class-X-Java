import java.util.*;
public class Electronic_World
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,k;
        double d=0,rp,np,tax;
        String name,st;
        System.out.println("Enter Name of the Customer");
        name=sc.next();
        System.out.println("Enter '1' for A-C or '2' for LCD TV");
        System.out.println("Enter your Choice");
        k=sc.nextInt();
        switch(k)
        {
            case 1:
            System.out.println("Enter the amount of purchase");
            p=sc.nextInt();
            if(p<=20000)
            {
                d=p*5.0/100.0;
            }
            else if(p>20000&&p<40000)
            {
                d=p*7.5/100.0;
            }
            else if(p>40000&&p<60000)
            {
                d=p*10.0/100.0;
            }
            else
            {
                d=p*12.0/100.0;
            }
            rp=p-d;
            tax=rp*12.5/100.0;
            np=rp+tax;
            System.out.println("Customer Name: "+name);
            System.out.println("The price of Product: "+p);
            System.out.println("The Discount: "+d);
            System.out.println("The Tax: "+tax);
            System.out.println("The Amount to be paid: "+np);
            break;
            case 2:
            System.out.println("Enter the amount of purchase");
            p=sc.nextInt();
            if(p<=20000)
            {
                d=p*2.5/100.0;
            }
            else if(p>20000&&p<40000)
            {
                d=p*5.0/100.0;
            }
            else if(p>40000&&p<60000)
            {
                d=p*7.0/100.0;
            }
            else
            {
                d=p*8.5/100.0;
            }
            rp=p-d;
            tax=rp*12.5/100.0;
            np=rp+tax;
            System.out.println("Customer Name: "+name);
            System.out.println("The price of Product: "+p);
            System.out.println("The Discount: "+d);
            System.out.println("The Tax: "+tax);
            System.out.println("The Amount to be paid: "+np);
            break;
            default:
            System.out.println("Wrong Input");
        }
    }
}
