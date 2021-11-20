import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
        int a;/*a is radius,b is pi value*/
        double b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius");
        a=sc.nextInt();
        b=3.14;
        c=b*a*a;
        System.out.println("Area of Circle = "+c); 
        c=2*a*b;
        System.out.println("Circumference"+c);
    }
}