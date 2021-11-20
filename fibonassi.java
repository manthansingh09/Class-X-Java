import java.util.*;
public class fibonassi
{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter End Point");
        n=sc.nextInt();
        System.out.println(n1+"\n"+n2);
        for(i=2;i<=n;i++)
        {
            n3=n2+n1;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
    }
}