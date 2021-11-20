import java.util.*;
public class Char_type
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char chr;
        System.out.println("Enter a Character");
        chr=sc.next().charAt(0);
        if(Character.isLetter(chr)==true)
        {
            if(Character.isUpperCase(chr)==true)
            {
                System.out.println("Its Upper Case");
            }
            if(Character.isLowerCase(chr)==true)
            {
                System.out.println("Its Lower Case");
            }
        }
        else if(Character.isDigit(chr)==true)
        {
            System.out.println("Its a Digit");
        }
        else
        {
            System.out.println("Special Character"); 
        }
    }
    
}
