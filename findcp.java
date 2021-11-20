public class findcp
{    public static void main(int profitSP,int lossSP)
    {   
        double c,b=20;
        c=(profitSP*100)/(100+b);
        System.out.println("Value of CP in Profit: "+c);
        c=(lossSP*100)/(100-b);
        System.out.println("Value of CP in Loss: "+c);
    }   
}