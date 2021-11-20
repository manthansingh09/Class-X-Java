import java.io.*;
public class Marks_Constructor
{
    String name;
    int age,m1,m2,m3,max;
    double avg;
    Marks_Constructor(String n, int d, int a, int b, int c)
    {
        name=n;
        age=d;
        m1=a;
        m2=b;
        m3=c;
    }
    void compute()
    {
        avg=(m1+m2+m3)/3;
        if(m1>m2&&m1>m3)
        {
            max=m1;
        }
        if(m2>m1&&m2>m3)
        {
            max=m2;
        }
        if(m3>m1&&m3>m2)
        {
            max=m3;
        }
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks in 3 Subject:"+m1+" "+m2+" "+m3);
        System.out.println("The Highest marks: "+max);
        System.out.println("The average marks: "+avg);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(read);
        String nm;
        int ag,a1,b1,c1;
        System.out.println("Enter Student Name, Age, Marks in 3 Subject one by one");
        nm=sc.readLine();
        ag=Integer.parseInt(sc.readLine());
        a1=Integer.parseInt(sc.readLine());
        b1=Integer.parseInt(sc.readLine());
        c1=Integer.parseInt(sc.readLine());
        Marks_Constructor ob=new Marks_Constructor(nm,ag,a1,b1,c1);
        ob.compute();
        ob.display();
    }
}
