import java.util.*;
public class SearchSDA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,k=0,ns;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.print("Enter The Number: ");
            m[i]=sc.nextInt();
        }
        System.out.println("Enter the number to searched: ");
        ns=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(m[i]==ns)
            {
                k=1;
            }
        }
        if(k==1)
        {
            System.out.println("Number Found!");
        }
        else
        {
            System.out.println("Number Not Found");
        }
    }
}