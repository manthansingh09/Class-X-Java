class PrimeCons
{
    int i,a;
    int n;
    PrimeCons()
    {
       n=0; 
    }
    void input(int x)
    {
        n=x;
    }
    void display()
    {
       a=0;
       for(i=1;i<=n;i++)
       {
           if(n%i==0)
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
