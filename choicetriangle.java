import java.util.*;
public class choicetriangle
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,k,n;
        System.out.println("Enter 1 for Triangle or 2 for Inverted Triangle");
        System.out.println("Enter your choice");
        k=in.nextInt();
        switch(k)
        {
            case 1:
             System.out.println("Enter The Number of Lines/Terms");
             n=in.nextInt();
             System.out.println("The Pattern:");
             for(i=1;i<=n;i++)
             {
                 for(j=1;j<=i;j++)
                 {
                     System.out.print("*");                 
                 }
                 System.out.println();
             }
             break;
            case 2:
             System.out.println("Enter The Number of Lines/Terms");
             n=in.nextInt();
             System.out.println("The Pattern:");
             for(i=n;i>=1;i--)
             {
                 for(j=1;j<=i;j++)
                 {
                     System.out.println("*");                 
                 }
                 System.out.println();
             }
            break;
            default:
             System.out.println("Wrong Choice");
        }
    }
}