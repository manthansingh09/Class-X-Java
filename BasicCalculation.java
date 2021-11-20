import java.util.*;
public class BasicCalculation
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a & b for addition");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum of two numbers = "+c); 
        
        System.out.println("Enter a & b for substaction");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a-b;
        System.out.println("Difference of two numbers = "+c);
        
        System.out.println("Enter a & b for Multiplication");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a*b;
        System.out.println("Product of two numbers = "+c);
        
        System.out.println("Enter a & b for Division");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        System.out.println("Quotient of two numbers = "+c);
    }
}