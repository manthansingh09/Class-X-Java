import java.util.*;
public class ElectricBill
{
    String n;
    int units;
    double bill;
    double surcharge=0;
    void accept() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name: ");
        n=sc.nextLine();
        System.out.println("Enter units consumed: ");
        units=sc.nextInt();
    }
    void calculate() 
    {
        if(units<=100)
        {
            bill=units*2;
        }
        else if(units<=300)
        {
            bill=200+(units - 100)*3;
        }
        else 
        {
            double a=200+600+(units-300)*5;
            surcharge=(a*2.5)/100.0;
            bill=a+surcharge;
        }
    }
    void print()
    {
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Surcharge is any: "+surcharge);
        System.out.println("Bill amount: " + bill);
    }
    public static void main(String args[])
    {
        ElectricBill ob=new ElectricBill();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}