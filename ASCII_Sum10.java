import java.util.*;
public class ASCII_Sum10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        int i,s=0;
        System.out.println("Enter 10 Character: ");
        for(i=1;i<=10;i++)
        {
            c=sc.next().charAt(0);
            s=s+(int)c;
        }
        System.out.println("Sum ASCII: "+s);
    }
}
