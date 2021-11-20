import java.util.Scanner;

public class minmax1
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 50 integers:");
        int small = Integer.MAX_VALUE, big = Integer.MIN_VALUE;
        for (int i = 1; i <= 50; i++) {
            int n = in.nextInt();
            if (n > big)
                big = n;
                
            if (n < small)
                small = n;
        }
        System.out.println("Smallest Number = " + small);
        System.out.println("Largest Number = " + big);
    }
}