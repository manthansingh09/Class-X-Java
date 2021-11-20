import java.util.*;
public class hourstominutes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        System.out.println("Enter Hours to Convert Into Mins");
        a=sc.nextInt();
        b=a*60;
        System.out.println("Converted Minutes="+b);
    }
}