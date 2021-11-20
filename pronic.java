import java.util.*;
public class pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No : ");
        int a=sc.nextInt();
        boolean b=false;
        for(int i=1;i<=a-1;i++)
        {
            if(i*(i+1)==a)
            {
                 b=true;
            }
        }
        if(b==true)
        {
            System.out.println("Its Pronic");
        }
        else
        {
            System.out.println("Not a Pronic");
        }
    }
}
