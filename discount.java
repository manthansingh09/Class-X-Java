import java.util.*;
public class discount
{
    public static void main(String args[])
    {
        float a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bill Amount to get discount");
        a=sc.nextInt();
        b=a-(a*5/100);
        System.out.println("Discounted Price="+b);
    }
}
