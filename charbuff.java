import java.io.*;
public class charbuff
{
    public static void main(String args[]) throws IOException
    {
        char m[]=new char[10];
        int i,j;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter all the characters: ");
        for(i=0;i<7;i++)
        {
            m[i]=(char)(in.read());
        }
        for(j=0;j<m.length;j++)
        {
            System.out.println(m[j]);
        }
    }
}