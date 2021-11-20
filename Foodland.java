import java.util.*;
public class Foodland
{
    public static void main(String args[])
    {
        int f=0,d=0,e=0;
        System.out.println("Welcome To Foodland");
        System.out.println("Order for Delicious Food Now");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times you want to order");
        int a=sc.nextInt();
        boolean ck=true;
        for(int b=1;b<=a;b++)
        {
            System.out.println("Enter 1 for Starter");
            System.out.println("Enter 2 for Haka Chinese");
            System.out.println("Enter 3 for Delicious Desserts");
            int i=sc.nextInt();
            
            if(i==1)
            {
                System.out.println("Enter 1 for Veg and 2 for Non Veg");
                int j=sc.nextInt();
                switch(j)
                {
                    case 1:
                    System.out.println("Enter 1 for Spring Rolls(INR 200)");
                    System.out.println("Enter 2 for Momos Veg(INR 150)");
                    System.out.println("Enter 3 for Hara Bhara Kebab(INr(100)");
                    int c=sc.nextInt();
                    if(c==1)
                    {
                         d=200;
                    }
                    else if(c==2)
                    {
                         d=150;
                    }   
                    else if(c==3)
                    {
                         d=100;
                    }
                    else
                    {
                        System.out.println("Wromg choice");
                    }   
                    break;
                    case 2:
                    System.out.println("Enter 1 for Chicken Chilly(INR 200)");
                    System.out.println("Enter 2 for Momos Non Veg(INR 150)");
                    System.out.println("Enter 3 for Tandoori Kebab(INr(100)");
                    int c1=sc.nextInt();
                    if(c1==1)
                    {
                         d=200;
                    }
                    else if(c1==2)
                    {
                         d=150;
                    }
                    else if(c1==3)
                    {
                         d=100;
                    }
                    else
                    {
                        System.out.println("Wrong choice");
                    }
                    break;
                    default:
                    System.out.println("Wrong");
                }
            }   
            else if(i==2)
            {
                System.out.println("Enter 1 for Veg and 2 for Non Veg");
                int j=sc.nextInt();
                switch(j)
                {
                    case 1:
                    System.out.println("Enter 1 for Veg Fried Rice(INR 200)");
                    System.out.println("Enter 2 for Veg Schewain Rice(INR 150)");
                    System.out.println("Enter 3 for Veg Haka Noodles(INr(100)");
                    int c=sc.nextInt();
                    if(c==1)
                    {
                         e=200;
                    }
                    else if(c==2)
                    {
                         e=150;
                    }   
                    else if(c==3)
                    {
                         e=100;
                    }
                    else
                    {
                        System.out.println("Wromg choice");
                    }   
                    break;
                    case 2:
                    System.out.println("Enter 1 for Egg Fried Rie(INR 200)");
                    System.out.println("Enter 2 for Chicken Fried Rice(INR 150)");
                    System.out.println("Enter 3 for Mix Hakka Noodle Rice(INr(100)");
                    int c1=sc.nextInt();
                    if(c1==1)
                    {
                         e=200;
                    }
                    else if(c1==2)
                    {
                         e=150;
                    }
                    else if(c1==3)
                    {
                         e=100;
                    }
                    else
                    {
                        System.out.println("Wrong choice");
                    }
                    break;
                    default:
                    System.out.println("Wrong");
                
                }
            }
            else if(i==3)
            {
                System.out.println("Enter 1 for S'mores - a campfire treat from USA.(INR 200)");
                System.out.println("Enter 2 for Rum Cake from the Caribbean.(INR 150)");
                System.out.println("Enter 3 for Baking with Matcha from Japan(INR 100)");
                int c3=sc.nextInt();
                if(c3==1)
                    {
                         f=200;
                    }
                else if(c3==2)
                    {
                         f=150;
                    }   
                else if(c3==3)
                    {
                         f=100;
                    }
                else
                    {
                        System.out.println("Wromg choice");
                    }   
            }
            else
            {
                ck=false;
                System.out.println("Wrong Choice Made");
            }
            
       }
       if(ck=true)
            {
                int bill=d+e+f;
                System.out.println("Bill Inclusive of all Taxes is = "+bill);
                System.out.println("Thanks for Visiting Foodland");
                System.out.println("Visit us Again, Have a Happy Day");
            }
    }
}
