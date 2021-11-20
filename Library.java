import java.util.*;
class Library
{
    int acc_num;
    String title;
    String author;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter Accession Number: ");
        acc_num=sc.nextInt();
        System.out.print("Enter Title of Book: ");
        sc.next();
        title=sc.next();
        System.out.print("Enter Author name: ");
        author=sc.next();
    }
    void compute()
    {
        int n,fine;
        System.out.print("Enter Late days: ");
        n=sc.nextInt();
        fine=n*2;
        System.out.println("Fine :"+fine);
    }
    void display()
    {
        System.out.println("Accession Number\t"+"Title\t"+"Author\t");
        System.out.println(acc_num+"\t"+title+"\t"+author+"\t");
    }
    public static void main(String args[])
    {
        Library ob=new Library();
        ob.input();
        ob.compute();
        ob.display();
    }
}