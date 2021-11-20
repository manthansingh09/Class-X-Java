import java.util.*;
public class divisible35
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter The Number To Check Divisibility");
        number=sc.nextInt();
        if(number%3==0)
        {
            if(number%5==0)
            {
                System.out.println("The Number is Divisible By 3 & 5");
            }
            else
            {
                System.out.println("The NUmber is Only Divisible by 3");
            }
        }
        else if(number%5==0)
        {
            System.out.println("The NUmber is only Divisible by 5");
        }
        else
        {
            System.out.println("The Number is Neither Divisible by 3 Nor by 5");
        }
    }
}