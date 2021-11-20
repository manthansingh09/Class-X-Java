import java.io.*;
public class dayconvert
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int y,m,d,a,b;
        System.out.println("Enter Days");
        a=Integer.parseInt(in.readLine());
        y=a/365;
        b=a%365;
        m=b/30;
        d=b%30;
        System.out.println("Year"+y);
        System.out.println("Month"+m);
        System.out.println("Days"+d);
    }
}