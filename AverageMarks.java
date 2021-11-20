import java.util.Scanner;
public class AverageMarks
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int rollNo[] = new int[n];
        String name[] = new String[n];
        int chem[] = new int[n];
        int phys[] = new int[n];
        int bio[] = new int[n];
        double avg[] = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Chemistry Marks: ");
            chem[i] = sc.nextInt();
            System.out.print("Physics Marks: ");
            phys[i] = sc.nextInt();
            System.out.print("Biology 3 Marks: ");
            bio[i] = sc.nextInt();
            avg[i] = (chem[i] + phys[i] + bio[i]) / 3.0;
        }
        
        System.out.println("Roll No\tName\tRemark");
        for (int i = 0; i < n; i++) 
        {
            String remark;
            if (avg[i] < 40)
            {
                remark = "Poor";
            }
            else if (avg[i] < 60)
            {
                remark = "Pass";
            }
            else if (avg[i] < 75)
            {
                remark = "First Class";
            }
            else if (avg[i] < 85)
            {
                remark = "Distinction";
            }
            else
            {
                remark = "Excellent";
            }
            System.out.println(rollNo[i] + "\t" + name[i] + "\t" + remark);
        }
    }
}