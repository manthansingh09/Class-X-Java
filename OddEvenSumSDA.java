import java.util.*;
public class OddEvenSumSDA
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int m [] = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < m.length; i++) 
        {
            m[i] = in.nextInt();
        }
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < m.length; i++) 
        {
            if (m[i] % 2 == 0)
            {
                evenSum += m[i];
            }
            else
            {
                oddSum += m[i];
            }
        }
        
        System.out.println("Sum of Odd numbers = " + oddSum);
        System.out.println("Sum of Even numbers = " + evenSum);
    }
}