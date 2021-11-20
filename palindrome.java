import java.io.*;
public class palindrome
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int d,n,p,r=0;
        n=Integer.parseInt(in.readLine());
        p=n;
        do
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        while(n!=0);
        if(r==p)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}