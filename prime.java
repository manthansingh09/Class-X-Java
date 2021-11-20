import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,num,a;
        System.out.println("Enter Number");
        num=sc.nextInt();
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                    System.out.println("Not a Prime Number");
                    break;
            }
            else
            {
                    System.out.println("Its a Prime");
            }
            break;
        }
    }
}