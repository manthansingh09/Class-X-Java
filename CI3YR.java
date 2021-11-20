public class CI3YR
{
    public static void main(int p)
    {
         double r=0.05 ,i,i1,i2;
         i=(p*r);
         System.out.println("First Year Rate: "+i);
         i1=(p+i)*r;
         System.out.println("Second Year Rate: "+i1);
         i2=(p+i1)*r;
         System.out.println("Third Year Rate: "+i2);
    }
}