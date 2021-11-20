import java.util.*;
public class percentage
{
    public static void main(String args[])
    {
        float a,b,c,d; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name=sc.nextLine();
        System.out.println("Enter three subject marks:-");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(a+b+c)/300*100;
        System.out.println("Name="+name);
        System.out.println("Percentage:"+d);
    }
}