import java.util.*;
public class Encode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c,ch;
        int t;
        System.out.println("Enter a Letter: ");
        c=sc.next().charAt(0);
        if(Character.isUpperCase(c))
        {
            t=(int)c+5;
        }
        else
        {
            t=(int)c-3;
        }
        ch=(char)t;
        System.out.println("Encoded Letter: "+ch);
    }
}