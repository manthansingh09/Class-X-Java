import java.util.*;
public class ASCII_Char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char chr,chr1;
        System.out.print("Enter: ");
        chr=sc.next().charAt(0);
        if(Character.isUpperCase(chr)==true)
        {
            chr1=Character.toLowerCase(chr);
            System.out.println("The Lower Case: "+chr1);
            System.out.println("ASCII Value: "+(int)chr1);
        }
        else if(Character.isLowerCase(chr)==true)
        {
            chr1=Character.toUpperCase(chr);
            System.out.println("The Upper Case: "+chr1);
            System.out.println("ASCII Value: "+(int)chr1);
        }
    }
}