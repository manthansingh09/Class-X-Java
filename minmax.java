import java.math.*;
public class minmax
{
    public static void main(int a,int b,int c)
    {
        double min=Math.min(a,b);
        double min1=Math.min(min,c);
        double max=Math.max(a,b);
        double max1=Math.max(max,c);
        System.out.println("Max= "+max1);
        System.out.println("Min= "+min1);
    }
}
