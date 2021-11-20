public class FloydsTriangle
{
    public static void main(int a)
    {
        int i,j,term=1;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(term+"\t");
                term++;
            }
            System.out.println();
        }
    }
}
