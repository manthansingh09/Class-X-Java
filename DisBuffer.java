public class DisBuffer
{
    public static void main(int a)
    {
        int b,c;
        b=a-(a*10/100);
        System.out.println("Discounted Rates: "+b);
        c=b+(b*18/100);
        System.out.println("GST Rates Included(With Roundoff): "+c);
    }
}        