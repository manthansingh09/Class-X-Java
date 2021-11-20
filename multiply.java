import java.util.*;
public class multiply
{
    public static void main(String args[])
    {
        int i,n,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Table");
        b=sc.nextInt();
        System.out.println("Enter End of "+b+"s Table");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i+"*"+b+"="+i*b+" ");
        } 
    }
}