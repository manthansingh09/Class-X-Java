import java.util.*;
public class FruitJuice
{
    int product_code,pack_size,product_price;
    String flavour,pack_type;
    FruitJuice()
    {
        product_code=0;
        pack_size=0;
        product_price=0;
        flavour="";
        pack_type="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Flavour: ");
        flavour=sc.nextLine();
        System.out.print("Enter Product Code: ");
        product_code=sc.nextInt();
        System.out.print("Enter Pack mL: ");
        pack_size=sc.nextInt();
        System.out.print("Enter Product Price: ");
        product_price=sc.nextInt();
        System.out.print("Enter Pack Type: ");
        pack_type=sc.nextLine();
    }
    void discount()
    {
        product_price-=10;
    }
    void display()
    {
        System.out.println();
        System.out.println("Product Code: "+product_code);
        System.out.println("Pack Size in mL: "+pack_size+" mL");
        System.out.println("Discounted Rate: "+product_price);
        System.out.println("Flavour: "+flavour);
        System.out.println("Packing Type: "+pack_type);
    }
    public static void main(String args[])
    {
        FruitJuice ob=new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
}