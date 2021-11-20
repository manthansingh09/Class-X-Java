public class rectangle
{
    int length;
    int breadth;
    int area;
    void input()
    {
        length=36;
        breadth=45;
    }
    void calculate()
    {
        area=length*breadth;
    }
    void print()
    {
        System.out.println("Area: "+area);
    }
    public static void main(String args[])
    {
        rectangle ob=new rectangle();
        ob.input();
        ob.calculate();
        ob.print();                     
    }
}
