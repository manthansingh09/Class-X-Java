import java.util.*;
public class Number_join
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        String s;
        System.out.println("Enter 1st Number: ");
        n1=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        n2=sc.nextInt();
        s=Integer.toString(n1)+Integer.toString(n2);
        System.out.println("Joined Numbers: "+s);
    }
}