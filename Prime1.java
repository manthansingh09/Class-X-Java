import java.util.*;
public class Prime1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,num,a=0;
        System.out.println("Enter Number");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                a=a+1;
            }
        }
        if(a==2)
        {
            System.out.println("Its a Prime Number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}