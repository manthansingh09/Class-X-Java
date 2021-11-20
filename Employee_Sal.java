import java.io.*;
public class Employee_Sal
{
    String name,empno;
    int basic;
    double da,hra,pf,gs,net;
    Employee_Sal(String n,String en, int bs)
    {
        name=n;
        empno=en;
        basic=bs;
    }
    void compute()
    {
        da=basic*30.00/100.00;
        hra=basic*15.00/100.00;
        pf=basic*12.00/100.00;
        gs=basic+da+hra;
        net=gs-pf;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Employee Number: "+empno);
        System.out.println("Gross Salary: "+gs);
        System.out.println("Net Salary: "+net);
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String nm,enm;
        int bsal;
        System.out.println("Enter Employee's name, Employee No, Basic Salary");
        nm=in.readLine();
        enm=in.readLine();
        bsal=Integer.parseInt(in.readLine());
        Employee_Sal ob=new Employee_Sal(nm,enm,bsal);
        ob.compute();
        ob.display();
    }
}