import java.util.*;
public class count_char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        int i,n,nuc=0,nlc=0;
        System.out.print("Enter Value of N: ");
        n=sc.nextInt();
        System.out.println("Enter "+n+" Characters: ");
        for(i=0;i<=n;i++)
        {
            c=sc.next().charAt(0);
            if(Character.isUpperCase(c))
            {
                nuc++;
            }
            else
            {
                nlc++;
            }
        }
        System.out.println("Upper Case: "+nuc);
        System.out.println("Lower Case: "+nlc);
    }
}