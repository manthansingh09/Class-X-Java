import java.util.*;
public class perimeter
{
    public static void main(String args[])
    {
        float l,b,perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and Breadth for Perimeter Calculation");
        l=sc.nextInt();
        b=sc.nextInt();
        perimeter=2*(l+b);
        System.out.println("Perimeter="+perimeter);
    }
}
