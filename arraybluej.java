public class arraybluej
{
    public static void main(int m[])
    {
        int i,p,sum=0;
        p=m.length;
        for(i=0;i<p;i++)
        {
            sum=sum+m[i];
        }
        System.out.println("The Sum of Array Elements: "+sum);
    }
}
