public class Profit_Loss
{
    int cp,sp,pr,loss;
    double pp,lp;
    Profit_Loss()
    {
        cp=0;
        sp=0;
    }
    void input(int m,int n)
    {
        cp=m;
        sp=n;
    }
    void display()
    {
        if(sp>cp)
        {
            pr=sp-cp;
            pp=(double)pr/cp*100;
            System.out.println("The Profit percent : "+pp);
        }
        if(cp>sp)
        {
            loss=cp-sp;
            lp=(double)pr/cp*100;
            System.out.println("The Loss Percent : "+lp);
        }
    }
    
}