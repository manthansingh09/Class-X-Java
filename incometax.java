public class incometax
{
    public static void main(int age,int income)
    {
        int a;
        if(age<=60)
        {
            if(income<=250000)
            {
                System.out.println("Nil");
            }
            else if(income>=250000&&income<=500000)
            {
                a=(income-160000)*10/100;
                System.out.println("TAX "+a);
            }
            else if(income>=500000&&income<=1000000)
            {
                a=(income-500000)*20/100+34000;
                System.out.println("TAX "+a);
            }
            else
            {
                a=(income-1000000)*30/100+94000;
                System.out.println("TAX "+a);
            }
        }
        else
        {
            System.out.println("Wrong Category");
        }
    }
}
