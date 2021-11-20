
public class Random_Char
{
    public static void main(String args[])
    {
        char c;
        int n;
        System.out.println("Random Numbers are: ");
        for(int i=1;i<=10;i++)
        {
            n=(int)(Math.random()*9)+1;
            c=(char)(n+64);
            System.out.println(c);
        }
    }
}

