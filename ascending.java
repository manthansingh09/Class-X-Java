import java.util.*;
public class ascending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number with 3 or more digits: ");
        int a=sc.nextInt();
        for (int i=0;i<=9;i++) 
        {
            int b=a;
            int c = 0;
            while (b!=0) 
            {
                if (b%10==i)
                {
                    c++;
                }
                b/=10;
            }
            for (int j = 1; j <= c; j++) 
            {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}