public class Max_Min_Array
{
    public static void main(String args[])
    {
        int [] a = {40,13,15,20,100,60};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<5;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Maximum element is "+max);
        for(int i=1;i<5;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Minimun element is "+min);
    }
}
