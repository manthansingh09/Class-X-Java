import java.util.Scanner;

public class KboatExamResult
{
    public static void main(String args[]) {
        final int TOTAL_STUDENTS = 3;
        Scanner in = new Scanner(System.in);
        
        int rollNo[] = new int[TOTAL_STUDENTS];
        int sA[] = new int[TOTAL_STUDENTS];
        int sB[] = new int[TOTAL_STUDENTS];
        int sC[] = new int[TOTAL_STUDENTS];
        double avg[] = new double[TOTAL_STUDENTS];
        
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            System.out.print("Subject A Marks: ");
            sA[i] = in.nextInt();
            System.out.print("Subject B Marks: ");
            sB[i] = in.nextInt();
            System.out.print("Subject C Marks: ");
            sC[i] = in.nextInt();
            avg[i] = (sA[i] + sB[i] + sC[i]) / 3.0;
        }
        
        System.out.println("\nRoll No\tAverage Marks");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println(rollNo[i] + "\t" + avg[i]);
        }
        
        System.out.println("\nStudents with Average above 80:");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            if (avg[i] > 80)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
        
        System.out.println("\nStudents with Average below 40:");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            if (avg[i] < 40)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
    }
}