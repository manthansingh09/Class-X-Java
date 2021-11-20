import java.util.*; 
class pattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        for (int i=0;i<= rows;i++) 
        {
            for (int j=rows;j>= i;j--) 
            {
                System.out.print(" ");
            }
  
            for (int j=1;j<= i;j++) 
            {
                System.out.print("*");
                
            }
         
            System.out.println();
        }
    }
}