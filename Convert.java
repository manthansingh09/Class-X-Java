public class Convert
{
    public static void main(int s)
    {
        int a,b,c,d,e;
        a=s/(60*60);      
        d=s%60*60;
        e=s%60;
        if(d!=0)
        {
            b=(s-(60*60))/60;
            if(e!=0)
            {
             c=e;
             System.out.println("Time is "+a+" Hours "+b+" Minutes "+c+" Seconds  ");
            }
        }
    }   
}