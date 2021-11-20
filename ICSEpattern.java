public class ICSEpattern
{
    public static void main(String args[])
    {
        String st="ICSE";
        for(int i=0;i<st.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(st.charAt(j));
            }
            System.out.println();
        }
    }
}