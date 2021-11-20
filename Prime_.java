public class Prime_
{
   int num;
   Prime_()
   {
       num=0;
   }
   void input(int x)
   {
       num=x;
   }
   void display()
   {
       int i,a=0;
       for(i=1;i<=num;i++)
       {
           if(num%i==0)
           {
               a=a+1;
            }
       }
       if(a==2)
       {
           System.out.println("Its a Prime Number");
       }
       else
       {
           System.out.println("Its Not a Prime");
       }
   }
}
