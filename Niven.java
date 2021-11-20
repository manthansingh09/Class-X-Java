import java.util.*;
public class Niven
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int orgNum = num;
        int digitSum = 0;
        while (num != 0)
        {
            int digit = num % 10;            
            num /= 10;            
            digitSum += digit;
        }
        if (digitSum != 0 && orgNum % digitSum == 0)
        {
            System.out.println(orgNum + " is a Niven number");
        }
        else
        {
            System.out.println(orgNum + " is not a Niven number");
        }
    }
}