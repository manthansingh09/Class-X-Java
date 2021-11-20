import java.util.*;
public class areamenu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        double r,ar,s,L,B;
        System.out.println("For Circle Area Press 1\nFor Square Area Press 2\nFor Rectangle press 3");
        a=sc.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("Enter Radius");
            r=sc.nextInt();
            ar=3.14*r*r;
            System.out.println("Area of Circle"+ar);
            break;
            case 2:
            System.out.println("Enter Side");
            s=sc.nextInt();
            ar=s*s;
            System.out.println("Area of Square"+ar);
            break;
            case 3:
            System.out.println("Enter Length and Breadth");
            L=sc.nextInt();
            B=sc.nextInt();
            ar=L*B;
            System.out.println("Area of Rectangle"+ar);
            break;
            default:
            System.out.println("Wrong");
        }
    }
}