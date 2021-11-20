import java.util.*; 
class RailwayTicket 
{
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;
    void accept( ) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Passenger’s Name: ");
        name = sc.next();
        System.out.print("Enter Mobile Number: ");
        mobno = sc.nextInt();
        System.out.print("Enter Coach (First_AC/Second_AC/Third_AC/sleeper): ");
        coach = sc.next();
        System.out.print("Enter basic amount of ticket: ");
        amt = sc.nextInt();
    }
    void update() 
    {
        if(coach=="First_AC")
        {
            totalamt=amt+700;
        }
        else if(coach=="Second_AC")
        {
            totalamt = amt+500;
        }
        else if(coach=="Third_AC")
        {
            totalamt = amt+250;
        }
        else
        {
            totalamt = amt;
        }
    }
    void display() {
        System.out.println("Name : " +name);
        System.out.println("Coach : " +coach);
        System.out.println("Total Amount: " +totalamt);
        System.out.println("Mobile No.: " +mobno);
    }
    public static void main (String args[ ]) 
    {
        RailwayTicket ob = new RailwayTicket();
        ob.accept();
        ob.update();
        ob.display();
    }
}