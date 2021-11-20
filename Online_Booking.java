import java.util.*;
public class Online_Booking
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int place,hotel,days,adults,child;
        double tariff;
        System.out.print("Enter 10 Digit Mobile Number: ");
        String num=sc.nextLine();
        System.out.print("Enter Name by which you wish to register: ");
        String name=sc.nextLine();
        System.out.print("Enter No. Of Days of Stay: ");
        days=sc.nextInt();
        System.out.print("Enter No Of Adults(Child above age of 10 is considered as adult): ");
        adults=sc.nextInt();
        System.out.print("Enter No. Of Child(Under 10): ");
        child=sc.nextInt();
        System.out.print("Enter \nMM for Mumbai \nDD for Delhi \nCH for Chandigarh");
        String c=sc.next();
        
        switch(c)
        {
            case "MM":
            System.out.println("Welcome to Mumbai");
            System.out.println();
            System.out.println("Enter Your Choice for Hotel from List Below: ");//10 Hotel
            System.out.println();
            System.out.println("1. Holiday Inn Mumbai International Airport");
            System.out.println("2. ITC Grand Central, A Luxury Collection Hotel, Mumbai");
            System.out.println("3. ITC Maratha, a Luxury Collection Hotel, Mumbai");
            System.out.println("4. The Taj Mahal Palace, Mumbai");
            System.out.println("5. Taj Lands End, Mumbai");
            System.out.println("6. Taj Santacruz");
            System.out.println("7. Radisson Mumbai Goregaon");
            System.out.println("8. Hotel Sahara Star");
            System.out.println("9. Sun-n-Sand Hotel, Juhu, Mumbai");
            System.out.println("10.Hotel Sea Princess");
            System.out.println("Enter Your Choice: ");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Welcome to Holiday Inn Mumbai International Airport");
                System.out.println("For Superior Room Press 1\nFor Executive Press 2\nFor Suit Press 3");
                int a=sc.nextInt();
                boolean ab=true;
                switch(a)
                {
                    case 1:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=10000;
                    System.out.println("Tariff per day : "+tariff);
                    double total=tariff*days;
                    System.out.println("Total Tariff: "+total);
                    break;
                    case 2:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=12500;
                    System.out.println("Tariff per day : "+tariff);
                    double total1=tariff*days;
                    System.out.println("Total Tariff: "+total1);
                    break;
                    case 3:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=15000;
                    System.out.println("Tariff per day : "+tariff);
                    double total2=tariff*days;
                    System.out.println("Total Tariff: "+total2);
                    break;
                    default:
                    System.out.println("Wrong Selection");
                    ab=false;
                }
                if(ab=true)
                {
                    System.out.println("You have a booking by name: "+name);
                    System.out.println("Adults:"+adults);
                    System.out.println("Child/ren"+child);
                    System.out.println("Relax in our spacious 30 sq mts room with 24hour Wi Fi LCD TV iPod docking hub");
                    System.out.println("ergonomic workstation and a lot more. When you arrive we will do our best to");
                    System.out.println("meet your room bed type as these are subject to availability and cannot be guaranteed.");
                    System.out.println();
                }
            }
            if(ch==2)
            {
                System.out.println("Welcome to ITC Grand Central, A Luxury Collection Hotel");
                System.out.println("For Superior Room Press 1\nFor Executive Press 2\nFor Suit Press 3");
                int a=sc.nextInt();
                boolean ab=true;
                switch(a)
                {
                    case 1:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=10000;
                    System.out.println("Tariff per day : "+tariff);
                    double total=tariff*days;
                    System.out.println("Total Tariff: "+total);
                    break;
                    case 2:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=12500;
                    System.out.println("Tariff per day : "+tariff);
                    double total1=tariff*days;
                    System.out.println("Total Tariff: "+total1);
                    break;
                    case 3:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=15000;
                    System.out.println("Tariff per day : "+tariff);
                    double total2=tariff*days;
                    System.out.println("Total Tariff: "+total2);
                    break;
                    default:
                    System.out.println("Wrong Selection");
                    ab=false;
                }
                if(ab=true)
                {
                    System.out.println("You have a booking by name: "+name);
                    System.out.println("Adults: "+adults);
                    System.out.println("Child/ren: "+child);
                    System.out.println("Inspired by Victorian architecture of Old Bombay,");
                    System.out.println("this landmark hotel is situated in the business and recreational centre of Parel.");
                    System.out.println("the hotel offers breath-taking views of the city, award-winning cuisine,");
                    System.out.println("elegantly appointed rooms and suites, signature wellness experiences and more.");
                }
            }
            if(ch==3)
            {
                System.out.println("Welcome to ITC Maratha, a Luxury Collection Hotel, Mumbai");
                System.out.println("For Superior Room Press 1\nFor Executive Room Press 2\nFor ITC One Room Press 3");
                int a=sc.nextInt();
                boolean ab=true;
                switch(a)
                {
                    case 1:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=8999;
                    System.out.println("Tariff per day : "+tariff);
                    double total=tariff*days;
                    System.out.println("Total Tariff: "+total);
                    break;
                    case 2:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=9999;
                    System.out.println("Tariff per day : "+tariff);
                    double total1=tariff*days;
                    System.out.println("Total Tariff: "+total1);
                    break;
                    case 3:
                    System.out.println("You have a Booking for "+days+" days");
                    tariff=12999;
                    System.out.println("Tariff per day : "+tariff);
                    double total2=tariff*days;
                    System.out.println("Total Tariff: "+total2);
                    break;
                    default:
                    System.out.println("Wrong Selection");
                    ab=false;
                }
                if(ab=true)
                {
                    System.out.println("You have a booking by name: "+name);
                    System.out.println("Adults: "+adults);
                    System.out.println("Child/ren: "+child);
                    System.out.println("Inspired by the Maratha dynasty, ITC Maratha brings you world class luxury in an ");
                    System.out.println("experience that resonates through a range of cuisines, accommodation and recreation options.");
                    System.out.println("Built over an area of 5.5 acres in the heart of Mumbai, ITC Maratha is a 5 star business hotel");
                    System.out.println("comprising of 380 elegantly appointed spacious guest-rooms.");
                }
            }
        }
    }
}
