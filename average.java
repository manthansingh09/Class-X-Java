import java.util.*;
public class average
{
    public static void main(String args[])
    {
        float a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers to find Average");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(a+b+c)/3;
        System.out.println("Average:"+d);
    }
}