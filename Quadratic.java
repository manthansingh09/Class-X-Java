import java.io.*;
public class Quadratic
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a,b,c;
        double d=0;
        System.out.println("Enter the Value of a,b,c");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        d=b*b-4*a*c;
        System.out.println("The Discriminant is");
        if(d<0)
        System.out.println("Roots are real and Unequal");
        if(d==0)
        System.out.println("Roots are real and Equal");
        if(d>0)
        System.out.println("Roots are imaginary and unequal");
        
    }
}
