import java.io.*;
public class BuzzGCD
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int op;
        System.out.println("Enter 1 for Buzz Number Check");
        System.out.println("Enter 2 for GCD Check");
        op=Integer.parseInt(in.readLine());
        switch(op)
        {
            case 1:
            int n;
            System.out.println("Enter a Number");
            n=Integer.parseInt(in.readLine());
            if(n%7==0||n%10==7)
            {
                System.out.println("Its a Buzz Number");
            }
            else
            {
                System.out.println("Not A Buzz Number");
            }
            break;
            case 2:
            int a,b,t=0;
            System.out.print("Enter Two Number");
            a=Integer.parseInt(in.readLine());
            b=Integer.parseInt(in.readLine());
            while(a%b!=0)
            {
                t=a%b;
                a=b;
                b=t;
            }
            System.out.println("GCD of Two Number= "+b);
            break;
            default:
            System.out.println("Invalid");
        }
    }
}
