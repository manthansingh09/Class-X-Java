import java.util.*;
public class bankdeposit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,a;
        int n,ch;
        System.out.println("Menu List");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.println("Enter Choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter Pincipal,Rate and Time");
            p=sc.nextDouble();
            r=sc.nextDouble();
            n=sc.nextInt();
            a=p*Math.pow((1+r/100),n);
            System.out.println("Maturity Amount\t"+a);
            break;
            case 2:
            System.out.println("Enter Pincipal,Rate and Time");
            p=sc.nextDouble();
            r=sc.nextDouble();
            n=sc.nextInt();
            a=p*n+p*(n*(n+1))/2*r/100*1/12;
            System.out.println("Maturity Amount\t"+a);
            break;
            default:
            System.out.println("Wrong");
        }
    }
}