import java.util.*;
class project
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
String city,name,area,carno;
int day,amt1=0;
System.out.println("Welcome to our site");
System.out.println("Enter your:\n"+"1.Name\n"+"2.Vehicle no\n"+"3.Area where you live");
name=sc.nextLine();
carno=sc.nextLine();
area=sc.nextLine();
System.out.println("Name: " +name);
System.out.println("Vehicle no.: " +carno);
System.out.println("Residence Area: "+area);
System.out.println("Enter no. of days you want to stay");
day=sc.nextInt();
System.out.println("In which city do you want to look for a hotel?");
System.out.println("1.Mumbai\n"+"2.Dehli\n"+"3.Bangalore");
city=sc.nextLine();
city=sc.nextLine();
if(city=="Mumbai")
{
System.out.println("Famous hotels in Mumbai:\n"+"1.Hotel Taj\n"+"2.Hotel Ibis\n"+"3.Hotel Citrus");
System.out.println("Famous hotels in Mumbai:\n"+"1.Hotel Taj\n"+"2.Hotel Ibis\n"+"3.Hotel Citrus");
System.out.println("Enter the hotel you would like to live in");
String hotel1;
hotel1=sc.nextLine();
{
if(hotel1=="Hotel Taj")
{
amt1=15000*day;
System.out.println("Address: Apollo Bandar, Colaba, Mumbai, Maharashtra:400001");
}
else if(hotel1=="Hotel Ibis")
{
amt1=10000*day;
System.out.println("Address: Junction Of Nehru Road, Vile Parle East, Mumbai, Maharashtra: 400099");
}
else if(hotel1=="Hotel Citrus")
{
amt1=5000*day;
System.out.println("Address: D T Shahani Road, near Telephone Exchange, Mumbai, Maharashtra 410401");
}
}
System.out.println("Amount:" +amt1);
}
}
}