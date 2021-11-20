import java.util.*;
public class Max_array1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m[]= new int[10];
        int max=m[0];
        for(int i=1;i<10;i++)
        {
            System.out.println("Enter digits");
            m[i]=sc.nextInt();
            if(max<m[1])
            {
                max=m[i];
            }
        }
        System.out.println("Max: "+max);
    }
}
