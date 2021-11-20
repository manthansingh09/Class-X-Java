import java.util.*;
public class employee
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User id and Deapertment for Salary(From 1/2/3)respectively");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("User id="+a+"Department id="+b);
        if(a==1&&b==1)
        {
            System.out.println("Salary is 15k INR");
        }
        else if(a==2&&b==1)
        {
            System.out.println("Salary is 20k INR");
        }
        else if(a==3&&b==1)
        {
            System.out.println("Salary is 25k INR");
        }
        else if(a==1&&b==2)
        {
            System.out.println("Salary is 30k INR");
        }
        else if(a==2&&b==2)
        {
            System.out.println("Salary is 35k INR");
        }
        else if(a==3&&b==2)
        {
            System.out.println("Salary is 40k INR");
        }
        else if(a==1&&b==3)
        {
            System.out.println("Salary is 45k INR");
        }
        else if(a==2&&b==3)
        {
            System.out.println("Salary is 50k INR");
        }
        else if(a==3&&b==3)
        {
            System.out.println("Salary is 55k INR");
        }
        else
        {
           System.out.println("Invalid");
        }
    }
}
